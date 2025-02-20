import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Practica3 {
    enum State {
        RED, // Detente
        GREEN, // Avanza
        YELLOW // Frena
    }

    // Clase semaforo
    static class TrafficLight {
        private String name;
        private State currentState;

        // Constructor
        public TrafficLight(String name, State initialState) {
            this.name = name; // Nombre del semaforo
            this.currentState = initialState; // Inicialmente en rojo
        }

        // transicion de estados
        public void nextState() {
            switch (currentState) {
                case RED -> currentState = State.GREEN; //
                case GREEN -> currentState = State.YELLOW; //
                case YELLOW -> currentState = State.RED; //
            }
        }

        public void displayState() {
            System.out.printf("Semaforo %s: %s\n", name, currentState);
        }

        // Obtener estado actual
        public State getCurrentState() {
            return currentState;
        }

        // clase main (metodo principal)
        public static void main(String[] args) throws InterruptedException {
            TrafficLight horizontalLight = new TrafficLight("Horizontal", State.GREEN);
            TrafficLight verticalLight = new TrafficLight("Vertical", State.RED);

            // Creamos un ejecutor de la simulacion, ejecuta ambos semaforos a la vez
            ExecutorService executor = Executors.newFixedThreadPool(2);

            // Ciclo de simulacion
            for (int i = 0; i < 10; i++) {
                System.out.printf("\n Ciclo %d\n", i + 1);

                // Tarea para el semaforo horizontal
                executor.submit(() -> {
                    synchronized (horizontalLight) {
                        synchronized (verticalLight) {
                            horizontalLight.displayState();
                            if (horizontalLight.getCurrentState() == State.YELLOW) {
                                // Solo permite que el vertical cambie si está en rojo
                                if (verticalLight.getCurrentState() == State.RED) {
                                verticalLight.nextState();
                                }
                            }
                            if(verticalLight.getCurrentState() == State.RED) {
                            horizontalLight.nextState();}
                        }
                    }
                });

                // Tarea semafoto vertical
                executor.submit(() -> {
                    synchronized (verticalLight) {
                        synchronized (horizontalLight) {
                            verticalLight.displayState();
                            if (verticalLight.getCurrentState() == State.YELLOW) {
                                // Solo permite que el horizontal cambie si está en rojo
                                if (horizontalLight.getCurrentState() == State.RED) {
                                    horizontalLight.nextState();
                                }
                            }
                            if(horizontalLight.getCurrentState() == State.RED) {
                            verticalLight.nextState();}
                        }
                    }
                });

                TimeUnit.SECONDS.sleep(2); // Pausa
            }
            // Cerrar el ejecutor
            executor.shutdown();
            if (!executor.awaitTermination(5, TimeUnit.SECONDS)) {
                executor.shutdownNow();
            }
        }
    }
}
