import java.util.Scanner;

public class Ejercicio9 {
    
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Introduce el tipo de producto(A, B o C): ");
        char producto = teclado.nextLine().toUpperCase().charAt(0);
        System.out.println("Introduce un precio: ");
        int precio = Integer.parseInt(teclado.nextLine());

        switch (producto) {
            case 'A':
                System.out.println("Se le aplica un 7% de descuento");
                break;
            case 'C':
                System.out.println("Se le aplica un 12% de descuento");
            
            break;
            case 'B':
            System.out.println("Se le aplica un 9% de descuento.");
            break;
        }

        if (precio < 500 && producto != 'B' && producto != 'A') {
            System.out.println("Se le aplica un 12% de descuento");
        }
    }
}
