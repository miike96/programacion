import java.util.Scanner;

public class Ejercicio6 {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int numA, numB, acumulador = 0;

        System.out.println("Introduce el primer número: ");
        numA = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce el segundo número: ");
        numB = Integer.parseInt(teclado.nextLine());

        for (int i = 1; i <= numB; i++) {
            acumulador += numA;
        }
        System.out.printf("El producto de %d y %d es: %d", numA, numB, acumulador);
    }
}
