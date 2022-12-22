import java.util.Scanner;

public class Ejercicio8 {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {

        int hora1, hora2;
        int min1, min2;
        int seg1, seg2;

        System.out.println("Introduce la primera hora: ");
        hora1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce los primeros minutos: ");
        min1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce los primeros segundos: ");
        seg1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce la segunda hora: ");
        hora2 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce los segundos minutos: ");
        min2 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce los últimos segundos: ");
        seg2 = Integer.parseInt(teclado.nextLine());

        if (hora1 > hora2 && min1 > min2 && seg1 > seg2) {
            System.out.println("Hora 1 es mayor.");
        } else if (hora1 < hora2 && min1 < min2 && seg1 < seg2) {
            System.out.println("Hora 2 es mayor.");

        }

    }
}
