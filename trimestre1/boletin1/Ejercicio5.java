import java.util.Scanner;

public class Ejercicio5 {

    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Introduce el primer número: ");
        int num1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce el segundo número: ");
        int num2 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce el tercer número: ");
        int num3 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce el cuarto número: ");
        int num4 = Integer.parseInt(teclado.nextLine());

        int suma = (num1 + num2 + num3 + num4);
        int media = suma / 4;

        if(num1 > media) {
            System.out.printf("El número %d es superior a la media %d", num1, media);
        }
        if (num2 > media) {
            System.out.printf("El número %d es superior a la media %d", num2, media);
        }
        if (num3 > media) {
            System.out.printf("El número %d es superior a la media %d", num3, media);
        }
        if (num4 > media) {
            System.out.printf("El número %d es superior a la media %d", num4, media);
        }
        System.out.println();
        System.out.printf("La media es %d", media);

    }
}
