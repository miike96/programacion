import java.util.Scanner;

public class Ejercicio8 {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        char respuesta;
        int num;
        int numMenor = Integer.MAX_VALUE;

        while (true) {
            System.out.println("Introduce un número: ");
            num = Integer.parseInt(teclado.nextLine());

            if (num < numMenor) {
                numMenor = num;
            }

            System.out.println("¿Desea introducir más números(S/N)?");
            respuesta = teclado.nextLine().toUpperCase().charAt(0);
            if (respuesta != 'S') {
                break;
            }

        }

        System.out.println("El menor de los números introducidos es: " + numMenor);

    }

}