/*import java.util.Arrays;
import java.util.Scanner;

public class turin {
    enum State{
        START,
        MOVE_LEFT,
        MOVE_RIGHT,
        DELETE_PLUS,
        ACCEPT
    }    

    private char[] tape; //emula la cinta infinita
    private int headPosition; //emula la posicion del cabezal
    private State currentState; //emula el estado del automata

    //constructor
    public TurinMachineAddition(String input) {
        this.tape = new char[input.length() + 10];
        Arrays.fill(this.tape, '_'); //este es el que insertará el input en la cinta
        for(int i = 0; i < input.length(); i++) {
            this.tape[i + 1] = input.charAt(i); //entrada en la cinta
        }
        this.headPosition = 1; //inicia el cabezal en la posicion 1
        this.currentState = State.START; 

    }

    public void expandTapeIfNeeded() {
        if(headPosition < 0){
            char[] newTape = new char[tape.length * 2];
            Arrays.fill(newTape, '_');
            System.arraycopy(tape, 0, newTape, tape.length, tape.length);
            tape = newTape;
            headPosition += tape.length / 2; //posicion final después de expandir
        } else if(headPosition >= tape.length){
            char[] newTape = new char[tape.length * 2];
            Arrays.fill(newTape, '_');
            System.arraycopy(tape, 0, newTape, 0, tape.length);
            tape = newTape; 
        }
    }

    public void run(){

    }

    public void printTape() {
        System.out.println("Final tape" + String.valueOf(tape));
    }

    public int countOnes(){
        int count = 0;
        for(char c: tape){
            if(c == '1'){
                count++;
            }
        }
        return count;
    }


}*/
