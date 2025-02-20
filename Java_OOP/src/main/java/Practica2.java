public class Practica2 {
    enum State {
        RED, // Detente
        GREEN, // Avanza
        YELLOW // Frena
    }

    // Clase semaforo
    static class TrafficLigh {
        private State currentState; // Estado actual del semaforo
        // Contructor

        public TrafficLigh() {
            this.currentState = State.RED; // Inicialmente en rojo
        }

        // transicion de estados
        public void nextStat() {
            switch (currentState) {
                case RED -> currentState = State.GREEN; //
                case GREEN -> currentState = State.YELLOW; //
                case YELLOW -> currentState = State.RED; //
            }
        }

        public State getCurrentState() {
            return currentState;
        }

        public void displayState() {
            switch (currentState) {
                case RED -> System.out.println("PARA MAMAHUEVO");
                case GREEN -> System.out.println("AVANCE!");
                case YELLOW -> System.out.println("ATENCIÓN! FRENADO!");
            }
        }
    }

    public static void main(String[] args) {
        TrafficLigh trafficLight = new TrafficLigh();

        // Simular el ciclo de luces
        for (int i = 0; i < 9; i++) {
            trafficLight.displayState(); // Muestra el estado
            trafficLight.nextStat();

            try {
                Thread.sleep(2000); // Pausa de 2 segundos
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }

    }

}
