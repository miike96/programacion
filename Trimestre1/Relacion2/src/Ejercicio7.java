import java.util.Scanner;

public class Ejercicio7 {
    
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        int acumulador;
        double suma = 0;
        double media;

        do {
            System.out.println("Introduce una cantidad de números: ");
            acumulador = Integer.parseInt(teclado.nextLine());
        } while (acumulador <= 0);

        for (int i = 1; i <= acumulador; i++) {
            System.out.println("Introduce el número " + i + ": ");
            double num = Double.parseDouble(teclado.nextLine());

            suma += num;
        }

        media = suma/acumulador;

        System.out.println("La media de los " + acumulador + " números es: " + media);
    }
    
}
