
/**
 * @author Miguel López
 */
import java.util.Scanner;

public class Ejercicio3 {
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int num1;

        do {
            System.out.println("Introduce el número: ");
            num1 = Integer.parseInt(teclado.nextLine());
        } while (num1 < 0);

        if (num1 % 2 == 0) {
            System.out.println("Es múltiplo de 2.");
        }
        if (num1 % 3 == 0) {
            System.out.println("El número es múltiplo de 3.");
        }

    }
}
