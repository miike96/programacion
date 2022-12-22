import java.util.Scanner;

public class Ejercicio6 {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce un carácter: ");
        char vocal = teclado.nextLine().toUpperCase().charAt(0);
        
        if (vocal == 'A') {
            System.out.println("Es la primera vocal.");
        }
        if (vocal == 'E') {
            System.out.println("Es la segunda vocal.");
        }
        if (vocal == 'I') {
            System.out.println("Es la tercera vocal.");
        }
        if (vocal == 'O') {
            System.out.println("Es la cuarta vocal.");
        }
        if (vocal == 'U') {
            System.out.println("Es la quinta vocal.");
        }
    }

}
