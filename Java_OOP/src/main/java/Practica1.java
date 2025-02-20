public class Practica1 {
    //definimos los estados del automata
    enum State{
        START,  //Inicial
        ONE,    //Despues de leer 0
        ACCEPT, //Desúes de leer 1
        REJECT  //Rechaza
    }

    public static boolean ValidateBinaryString(String input){
        //estado inicial del automata
        State currentState = State.START;

        //procesammos los caracteres de las cadenas
        for(char c: input.toCharArray()){
            switch(currentState){
                case START:
                    if(c == '0'){
                        currentState = State.ONE;
                    }else if(c == '1'){
                        currentState = State.REJECT;
                    }else{
                        return false;
                    }
                    break;
                case ONE:
                    if(c == '0'){
                        currentState = State.ONE;
                    }else if(c == '1'){
                        currentState = State.ACCEPT;
                    }else{
                        return false;
                    }
                    break;
                case ACCEPT:
                    if(c == '0'){
                        currentState = State.ONE;
                    } else if(c == '1'){
                        currentState = State.REJECT;
                    } else{
                        return false;
                    }
                    break;
                case REJECT:
                    if(c == '0'){
                        currentState = State.ONE;
                    } else if(c == '1'){
                        currentState = State.REJECT;
                    } else{
                        return false;
                    }
                    break;
            }

        }
        //verificamos el estado final del automata
        return currentState == State.ACCEPT;
    }

    public static void main(String[] args) {
        String[] testCases = {"01", "001", "1001", "110", "111", "000"};
        for(String testCase: testCases){
            System.out.println("Validando la cadena: " + testCase + " -> " + 
            (ValidateBinaryString(testCase) ? "Aceptada" : "Rechazado"));
        }
    
    }
    
}
