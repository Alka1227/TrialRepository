import java.util.*;
//import javax.security.auth.Subject;

public class AnalizadorSintatico{
    //Definir estados
    enum State{
        START,
        SUBJECT,
        VERB,
        PREDICATE,
        ACCEPT,
        REJECT,
        END
    }

    static class GrammarRules{
        public static final List<String> ARTICLES = List.of("the","a","an");
        public static final List<String> NOUNS = List.of("cat","dog","person","car","park");
        public static final List<String> VERBS = List.of("runs","eats","jumps","drives");
        public static final List<String> OBJECTS = List.of("food","ball","road","grass");
    }

    //Metodo para analizar
    public static void analyzeSentence(String sentence){
        String[] words = sentence.toLowerCase().split("\\s+");
        State currentState = State.START;
        boolean subjectIdentified = false;
        Deque<String> stack = new ArrayDeque<>();
        for (String word : words){
            switch (currentState) {
                case START -> {
                    if(GrammarRules.ARTICLES.contains(word)){
                        stack.push("ARTICLES");
                        System.out.println("Identificado: Articulo  -> " + word);
                    } else if (GrammarRules.NOUNS.contains(word)){
                        stack.push("SUBJECT");
                        subjectIdentified = true;
                        currentState = State.SUBJECT;
                        System.out.println("Identificado: Sujeto -> " + word);
                    }
                }
                case SUBJECT -> {
                    if(!subjectIdentified && GrammarRules.NOUNS.contains(word)){
                        stack.push("SUBJECT");
                        subjectIdentified = true;
                        currentState = State.VERB;
                        System.out.println("Identificado: Sujeto -> " + word);
                    } else if (GrammarRules.VERBS.contains(word) && subjectIdentified){
                        stack.push("VERB");
                        currentState = State.REJECT;
                    }
                }
                case VERB -> {
                    if(GrammarRules.ARTICLES.contains(word)){
                        stack.push("PREDICATE");
                        currentState = State.PREDICATE;
                        System.out.println("Identificado: Predicado -> " + word);
                    } else {
                        currentState = State.REJECT;
                    }
                }
                case PREDICATE -> {
                    currentState = State.ACCEPT; //si hay mas palabras las ignora
                }
                default -> currentState = State.REJECT;

            }
            if(currentState == State.REJECT){
                System.out.println("Oración rechazada: " + word + " no cumple las reglas gramaticales");
                return;
            }
        }
        //Verificamos si el analizis finalizo en un estado válido
        if(currentState == State.ACCEPT){
            System.out.println("Oración aceptada");
        }else{
            System.out.println("Oración rechazada");
        }
    }
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Analizador Sintáctico");
            System.out.println("Ingrese una oración (en inglés):");
            String input = scanner.nextLine();
            System.out.println("\n Analizando...\"" + input + "\"");
            scanner.close();
            analyzeSentence(input);
        }
    
}