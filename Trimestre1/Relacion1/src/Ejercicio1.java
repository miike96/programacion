import java.util.Scanner;

public class Ejercicio1 {

    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Introduce un número: ");
        int num = Integer.parseInt(teclado.nextLine());

        if (num %2 == 0) {
            System.out.println("El número es par.");
        } else {
            System.out.println("El número es impar.");
        }
        teclado.close();

    }

}