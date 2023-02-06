import java.util.Scanner;

public class Ejercicio10 {
    
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        int factorial = 1;
        do {
            System.out.println("Introduce un número positivo: ");
            num = Integer.parseInt(teclado.nextLine());
        } while (num < 0);

        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }

        System.out.println("El factorial de " + num + " es: " + factorial);
    }
}
