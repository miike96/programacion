import java.util.Scanner;

public class Ejercicio9 {
    
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        int num;
        int suma = 0;

        do {
            System.out.println("Introduce un número entero positivo: ");
            num = Integer.parseInt(teclado.nextLine());
        } while (num <= 0);

        for (int i = 1; i < num; i++) {
            if (num %i == 0) {
                suma +=i;
            }
        }

        if (suma == num) {
            System.out.println(num + " es un número perfecto.");
        } else {
            System.out.println(num + " no es un número perfecto.");
        }

    }
}
