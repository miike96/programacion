import java.util.Scanner;

public class Ejercicio2 {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Introduce el primer número: ");
        int num1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce el segundo número: ");
        int num2 = Integer.parseInt(teclado.nextLine());

        if (num2 < num1) {
            System.out.println("El primer número introducido es mayor.");
        } else {
            System.out.println("El segundo número introducido es mayor.");
        }
        if (num1 == num2) {
            System.out.println("Ambos números son iguales.");
        }

    }

}
