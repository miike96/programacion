import java.util.Scanner;

public class Ejercicio5 {

    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        int num;
        int acumulador = 0;
        
        while(true) {
            System.out.println("Introduce un número(negativo para salir): ");
            num = Integer.parseInt(teclado.nextLine());
            
            if (num < 0) {
                break;
            }
            acumulador++;
        }
        System.out.printf("Se han introducido %d números positivos.", acumulador);
    }
    
}
