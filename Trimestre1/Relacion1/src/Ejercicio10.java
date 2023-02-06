import java.util.Scanner;

public class Ejercicio10 {
    
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        

        System.out.println("Introduce un carácter: ");
        char caracter = teclado.nextLine().charAt(0);
        System.out.println("Introduce el primer número: ");
        int num1 = Integer.parseInt(teclado.nextLine());
        System.out.println("Introduce el segundo número: ");
        int num2 = Integer.parseInt(teclado.nextLine());

        switch (caracter) {
            case '*':
                int multiplicar = num1 * num2;
                System.out.println(multiplicar);
                break;
            case '+':
                int suma = num1 + num2;
                System.out.println(suma);
                break;
            case '-':
                int resta = num1 - num2;
                System.out.println(resta);
                break;
            case '/':
                double division =  (double) (num1 / num2);
                System.out.println(division);
                break;
            default:
                break;
        }
    }
}
