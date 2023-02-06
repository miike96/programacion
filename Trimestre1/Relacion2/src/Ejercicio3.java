import java.util.Scanner;

public class Ejercicio3 {

    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        int num;

        do {
            System.out.println("Introduce un número positivo: ");
            num = Integer.parseInt(teclado.nextLine());
        } while (num < 0);

    }
    
}
