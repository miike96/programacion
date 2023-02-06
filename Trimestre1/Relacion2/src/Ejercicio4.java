import java.util.Scanner;

public class Ejercicio4 {
    
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        int num;
        int suma;
        do {
            System.out.println("Introduce un número positivo: ");
            num = Integer.parseInt(teclado.nextLine());
        } while (num <= 0);

        suma = 0;
        for(int i = 1; i <= num; i++) {
            suma += i;
        }
        System.out.printf("La suma de los %d primeros números es %d", num, suma);
        
    }

}
