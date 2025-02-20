/*import java.util.*;

public class NFA {
    // Estados del NFA representados como una lista
    private Set<String> states;
    // Alfabeto permitido (puertas por las que el robot puede pasar)
    private Set<Character> alphabet;
    // Transiciones (de qué estado a cuáles puede ir usando un símbolo)
    private Map<String, Map<Character, Set<String>>> transitions;
    // Estado inicial
    private String startState;
    // Estados finales (habitaciones de destino)
    private Set<String> finalStates;

    public NFA(Set<String> states, Set<Character> alphabet,
               Map<String, Map<Character, Set<String>>> transitions,
               String startState, Set<String> finalStates) {
        this.states = states;
        this.alphabet = alphabet;
        this.transitions = transitions;
        this.startState = startState;
        this.finalStates = finalStates;
    }

    // Método para verificar si una cadena es aceptada por el NFA
    public boolean isAccepted(String input) {
        // Inicia el procesamiento desde el estado inicial
        return process(input, new HashSet<>(Collections.singleton(startState)));
    }

    private boolean process(String input, Set<String> currentStates) {
        if (input.isEmpty()) {
            // Si no quedan más símbolos, verifica si algún estado actual es final
            for (String state : currentStates) {
                if (finalStates.contains(state)) {
                    return true;
                }
            }
            return false;
        }

        char symbol = input.charAt(0); // Primer símbolo de la cadena
        String remainingInput = input.substring(1); // Resto de la cadena

        // Calcula los próximos estados alcanzables
        Set<String> nextStates = new HashSet<>();
        for (String state : currentStates) {
            if (transitions.containsKey(state) && transitions.get(state).containsKey(symbol)) {
                nextStates.addAll(transitions.get(state).get(symbol));
            }
        }

        // Procesa recursivamente los próximos estados con el resto de la cadena
        return process(remainingInput, nextStates);
    }

    // Ejemplo principal (main)
    public static void main(String[] args) {
        // Estados: habitaciones
        Set<String> states = new HashSet<>(Arrays.asList("q0", "q1", "q2"));
        // Alfabeto: puertas
        Set<Character> alphabet = new HashSet<>(Arrays.asList('a', 'b'));

        // Transiciones: define a qué habitaciones puede ir el robot desde un estado actual
        Map<String, Map<Character, Set<String>>> transitions = new HashMap<>();
        transitions.put("q0", Map.of(
                'a', new HashSet<>(Arrays.asList("q1", "q2")) // Desde q0, con 'a', puede ir a q1 o q2
        ));
        transitions.put("q1", Map.of(
                'b', new HashSet<>(Collections.singleton("q2")) // Desde q1, con 'b', puede ir a q2
        ));
        transitions.put("q2", Map.of(
                'a', new HashSet<>(Collections.singleton("q2")) // Desde q2, con 'a', permanece en q2
        ));

        // Estado inicial: habitación inicial
        String startState = "q0";
        // Estados finales: habitaciones de destino
        Set<String> finalStates = new HashSet<>(Collections.singleton("q2"));

        // Crea el NFA
        NFA nfa = new NFA(states, alphabet, transitions, startState, finalStates);

        // Ejemplo de cadenas
        System.out.println("¿Cadena 'a' aceptada? " + nfa.isAccepted("a")); // True
        System.out.println("¿Cadena 'ab' aceptada? " + nfa.isAccepted("ab")); // True
        System.out.println("¿Cadena 'aa' aceptada? " + nfa.isAccepted("aa")); // True
        System.out.println("¿Cadena 'b' aceptada? " + nfa.isAccepted("b")); // False
    }
}
*/
