import java.util.Scanner;

public class Ejercicio4 {
    
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Introduce un número: ");
        int num = Integer.parseInt(teclado.nextLine());

        if (num >= 0 && num <= 12) {
            System.out.println("Es un niño.");
        }
        if (num >= 13 && num <= 17) {
            System.out.println("Es un adolescente.");
        }
        if (num >= 18 && num <= 29) {
            System.out.println("Es un joven.");
        } else {
            System.out.println("Es un adulto.");
        }

    }
}
