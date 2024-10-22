
package SIU;
import SIU.Caballero;
import SIU.Mago;
import SIU.Personaje;
import javax.swing.JFrame;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author javie
 */
public class ALBION {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in); //primero se crea el scanner y se crean las variables
        boolean confirmed = false;
        boolean autoplay = false;
        while(!confirmed){  
        JButton buttonCaballero = new JButton("Caballero");
        JButton buttonMago = new JButton("Mago");
        Object[] options = {"Knight","Mage" };
        int choice = JOptionPane.showOptionDialog(
                null,
                "Select your character:",
                "Choose",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                options,
                options[0]);
            if (choice == 0) {
                Caballero prota1 = new Caballero(); 
                int response = JOptionPane.showConfirmDialog(null, "You have selected Knight, is it OK?", "Question", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    confirmed= true;
                    String nombre = JOptionPane.showInputDialog(null,"How do you want to be called? ");
                    prota1.setNombre(nombre);
                    prota1.setPV(100);
                    prota1.setPA(25);
                    prota1.setPD(30);
                    prota1.display();
                    
                    
                    JOptionPane.showMessageDialog(null, "You are a mighty hero who has been selected to save a poor town from all evil", "Warning", JOptionPane.WARNING_MESSAGE);
                    JOptionPane.showMessageDialog(null, "You are a walking normaly, when out of the sudden you see someone stealing from a villager!", "Warning", JOptionPane.WARNING_MESSAGE);
                    JOptionPane.showMessageDialog(null, "You can stand out of this, you have to do something", "Warning", JOptionPane.WARNING_MESSAGE);
                    JOptionPane.showMessageDialog(null, "So you start a fight with the guy", "Warning", JOptionPane.WARNING_MESSAGE);
        
                    int Jugar = JOptionPane.showConfirmDialog(null, "Do you want autoplay?", "Question", JOptionPane.YES_NO_OPTION);
                    if (Jugar == JOptionPane.YES_OPTION) {
                        autoplay = true;
                    } else {
                        autoplay =false;
                    }                   
                    
                    Caballero maquina = new Caballero();
                    maquina.setNombre("Knight Enemy");
                    maquina.setPV(100);
                    maquina.setPA(25);
                    maquina.setPD(30);
        
                    // Variables de juego
                    boolean juegoEnCurso = true;
                    boolean turnoJugador = true;
                    int contadorTurnos = 0;
                    int umbralRestablecimiento = 3;

                    // Bucle principal del juego
                    while (juegoEnCurso) {
                        // Verificar si es el turno del jugador
                        if (turnoJugador) {
                
                        // Crear la ventana de juego
                        if (autoplay==true){
                        
                        //Autoplay
                        Random random = new Random();
                        int AccionAleatoria = random.nextInt(10); // Generar un número aleatorio entre 0 y 9

                        if (AccionAleatoria < 4) { // 40% de probabilidad (0, 1, 2, 3)
                        prota1.atacar(maquina);
                        maquina.display();
                        } else if (AccionAleatoria < 7) { // 30% de probabilidad (4, 5, 6)
                        prota1.Rempalago(maquina);
                        maquina.display();
                        } else if (AccionAleatoria < 9) { // 20% de probabilidad (7, 8)
                        prota1.defender();
                        maquina.display();
                        
                        
                        } else { // 10% de probabilidad (9)
                        prota1.curarse();
                        }
                        
                        } else if (autoplay==false){
                        //Decisiones con switch pq no pude de otra forma
                        System.out.println("What are you going to do?");
                        System.out.println("1. Attack");
                        System.out.println("2. Lightning");
                        System.out.println("3. Defense");
                        System.out.println("4. Heal");
                        
                        int Accion_a_Realizar = ask.nextInt();
                        if(Accion_a_Realizar<=4){
                        switch(Accion_a_Realizar){
                                case 1:
                                   prota1.atacar(maquina);
                                   break;
                                case 2:
                                    prota1.Rempalago(maquina);
                                    break;
                                case 3:
                                    prota1.defender();
                                    break;
                                case 4:
                                    prota1.curarse();
                                    break;
                        
                        }            
                        } 
                        }
                        

                        // Verificar si es necesario restablecer los valores de defensa
                        if (contadorTurnos >= umbralRestablecimiento) {
                        prota1.restablecerValoresDefensa();
                        maquina.restablecerValoresDefensa();
                        contadorTurnos = 0;
                        }

                        // Cambiar el turno al siguiente jugador
                        turnoJugador = false;
                        } else {
                        // Turno de la máquina: generar una acción aleatoria
                        Random random = new Random();
                        int accionAleatoria = random.nextInt(10); // Generar un número aleatorio entre 0 y 9

                        if (accionAleatoria < 4) { // 40% de probabilidad (0, 1, 2, 3)
                        maquina.atacar(prota1);
                        } else if (accionAleatoria < 7) { // 30% de probabilidad (4, 5, 6)
                        maquina.Rempalago(prota1);
                        } else if (accionAleatoria < 9) { // 20% de probabilidad (7, 8)
                        maquina.defender();
                        } else { // 10% de probabilidad (9)
                        maquina.curarse();
                        }
                        prota1.display();


                        // Verificar si es necesario restablecer los valores de defensa
                        if (contadorTurnos >= umbralRestablecimiento) {
                        prota1.restablecerValoresDefensa();
                        maquina.restablecerValoresDefensa();
                        contadorTurnos = 0;
                        }

                        // Cambiar el turno al siguiente jugador
                        turnoJugador = true;
                        }
        

                         // Incrementar el contador de turnos
                            contadorTurnos++;

                        // Verificar si el juego ha terminado
                        if (prota1.getPV() <= 0 || maquina.getPV() <= 0) {
                        juegoEnCurso = false;
                        }
                        }

                        // Mostrar el resultado final del juego
                        if (prota1.getPV() <= 0) {
                        JOptionPane.showMessageDialog(null, "You've lost!");}
                        else if (maquina.getPV() <= 0) {
                        JOptionPane.showMessageDialog(null, "You have won, congratulations!");
                        }
                        }
                }
                if (choice == 1) {
                Mago prota2 = new Mago();
                int response = JOptionPane.showConfirmDialog(null, "You have selected Mage, is it OK?", "Question", JOptionPane.YES_NO_OPTION);
                if (response == JOptionPane.YES_OPTION) {
                    confirmed= true;
                    String nombre = JOptionPane.showInputDialog(null,"How do you want to be called? ");
                    prota2.setNombre(nombre);
                    prota2.setPV(100);
                    prota2.setPA(35);
                    prota2.setPD(25);
                    prota2.display();
                    
                    
                    JOptionPane.showMessageDialog(null, "You are a mighty hero who has been selected to save a poor town from all evil", "Warning", JOptionPane.WARNING_MESSAGE);
                    JOptionPane.showMessageDialog(null, "You are a walking normaly, when out of the sudden you see someone stealing from a villager!", "Warning", JOptionPane.WARNING_MESSAGE);
                    JOptionPane.showMessageDialog(null, "You can stand out of this, you have to do something", "Warning", JOptionPane.WARNING_MESSAGE);
                    JOptionPane.showMessageDialog(null, "So you start a fight with the guy", "Warning", JOptionPane.WARNING_MESSAGE);
        
                    int Jugar = JOptionPane.showConfirmDialog(null, "Do you want autoplay?", "Question", JOptionPane.YES_NO_OPTION);
                    if (Jugar == JOptionPane.YES_OPTION) {
                        autoplay = true;
                    } else {
                        autoplay =false;
                    }    
                    
                    Caballero maquina = new Caballero();
                    maquina.setNombre("Knight Enemy");
                    maquina.setPV(100);
                    maquina.setPA(25);
                    maquina.setPD(30);
                    
                    // Variables de juego
                    boolean juegoEnCurso = true;
                    boolean turnoJugador = true;
                    int contadorTurnos = 0;
                    int umbralRestablecimiento = 3;

                    // Bucle principal del juego
                    while (juegoEnCurso) {
                        // Verificar si es el turno del jugador
                        if (turnoJugador) {
                
                        // Crear la ventana de juego
        
                        //Autoplay
                        if (autoplay==true){
                    
                        Random random = new Random();
                        int AccionAleatoria = random.nextInt(10); // Generar un número aleatorio entre 0 y 9

                        if (AccionAleatoria < 4) { // 40% de probabilidad (0, 1, 2, 3)
                        prota2.atacar(maquina);
                        } else if (AccionAleatoria < 7) { // 30% de probabilidad (4, 5, 6)
                        prota2.Rempalago(maquina);
                        } else if (AccionAleatoria < 9) { // 20% de probabilidad (7, 8)
                        prota2.defender();
                        } else { // 10% de probabilidad (9)
                        prota2.curarse();
                        }
                        maquina.display();
                        } else if (autoplay==false){
                        //Decisiones con switch pq no pude de otra forma
                        System.out.println("What are you going to do?");
                        System.out.println("1. Attack");
                        System.out.println("2. Lightning");
                        System.out.println("3. Defense");
                        System.out.println("4. Heal");
                        
                        int Accion_a_Realizar = ask.nextInt();
                        if(Accion_a_Realizar<=4){
                        switch(Accion_a_Realizar){
                                case 1:
                                   prota2.atacar(maquina);
                                   break;
                                case 2:
                                    prota2.Rempalago(maquina);
                                    break;
                                case 3:
                                    prota2.defender();
                                    break;
                                case 4:
                                    prota2.curarse();
                                    break;
                        
                        }            
                        } 
                        }

                        // Verificar si es necesario restablecer los valores de defensa
                        if (contadorTurnos >= umbralRestablecimiento) {
                        prota2.restablecerValoresDefensa();
                        maquina.restablecerValoresDefensa();
                        contadorTurnos = 0;
                        }

                        // Cambiar el turno al siguiente jugador
                        turnoJugador = false;
                        } else {
                        // Turno de la máquina: generar una acción aleatoria
                        Random random = new Random();
                        int accionAleatoria = random.nextInt(10); // Generar un número aleatorio entre 0 y 9

                        if (accionAleatoria < 4) { // 40% de probabilidad (0, 1, 2, 3)
                        maquina.atacar(prota2);
                        } else if (accionAleatoria < 7) { // 30% de probabilidad (4, 5, 6)
                        maquina.Rempalago(prota2);
                        } else if (accionAleatoria < 9) { // 20% de probabilidad (7, 8)
                        maquina.defender();
                        } else { // 10% de probabilidad (9)
                        maquina.curarse();
                        }

                        prota2.display();


                        // Verificar si es necesario restablecer los valores de defensa
                        if (contadorTurnos >= umbralRestablecimiento) {
                        prota2.restablecerValoresDefensa();
                        maquina.restablecerValoresDefensa();
                        contadorTurnos = 0;
                        }

                        // Cambiar el turno al siguiente jugador
                        turnoJugador = true;
                        }
        

                         // Incrementar el contador de turnos
                            contadorTurnos++;

                        // Verificar si el juego ha terminado
                        if (prota2.getPV() <= 0 || maquina.getPV() <= 0) {
                        juegoEnCurso = false;
                        }
                        }

                        // Mostrar el resultado final del juego
                        if (prota2.getPV() <= 0) {
                        JOptionPane.showMessageDialog(null, "You've lost!");}
                        else if (maquina.getPV() <= 0) {
                        JOptionPane.showMessageDialog(null, "You have won, congratulations!");
                        }
                    
                    }
                    
                    }
        }
        
        
}}
    
    

    

