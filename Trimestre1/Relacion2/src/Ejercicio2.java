import java.util.Scanner;

public class Ejercicio2 {

    private static Scanner teclado = new Scanner(System.in);
    public static void main(String[] args) {
        
        System.out.println("Introduce un número: ");
        int num = Integer.parseInt(teclado.nextLine());

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " * " + num + " = " + i * num);
        }
    }
}
