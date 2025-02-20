import java.util.Scanner;

public class Mail {
    enum Estado {
        Q0, Q1, Q2, Q3, Q4, Q5, Q6, ERROR
    }

    // ciclo para recorrer el correo
    public static boolean isValidMail(String correo) {
        Estado estado = Estado.Q0;
        for (int i = 0; i < correo.length(); i++) {
            char c = correo.charAt(i);
            // Switch que valide estados/secciones del correo
            switch (estado) {
                case Q0:
                    if (Character.isLetterOrDigit(c) || c == '-' || c == '.' || c == '_' || c == '+' || c == '%') {
                        estado = Estado.Q1;
                    } else {
                        estado = Estado.ERROR;
                    }
                    break;
                case Q1:
                    if (Character.isLetterOrDigit(c) || c == '-' || c == '.' || c == '_' || c == '+' || c == '%') {
                        estado = Estado.Q1;
                    } else if (c == '@') {
                        estado = Estado.Q2;
                    } else {
                        estado = Estado.ERROR;
                    }
                    break;
                case Q2:
                    if (Character.isLetterOrDigit(c) || c == '.') {
                        estado = Estado.Q3;
                    } else {
                        estado = Estado.ERROR;
                    }
                    break;
                case Q3:
                    if (Character.isLetterOrDigit(c) || c == '-') {
                        estado = Estado.Q3;
                    } else if (c == '.') {
                        estado = Estado.Q4;
                    } else {
                        estado = Estado.ERROR;
                    }
                    break;
                case Q4:
                    if (Character.isLetter(c)) {
                        estado = Estado.Q5;
                    } else {
                        estado = Estado.ERROR;
                    }
                    break;
                case Q5:
                    if (Character.isLetter(c)) {
                        estado = Estado.Q6;
                    } else {
                        estado = Estado.ERROR;
                    }
                    break;
                case Q6:
                    if (Character.isLetter(c) || c == '.') {
                        estado = Estado.Q4;
                    } else {
                        estado = Estado.ERROR;
                    }
                    break;
                case ERROR:
                    return false;

            }
        }
        return estado == Estado.Q5; // validamos el estado final
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su correo electrónico: ");
        String correo = scanner.nextLine();
        System.out.println(correo + " Es valido: " + isValidMail(correo));
        scanner.close();
    }
}
