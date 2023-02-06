import java.util.Scanner;

public class Ejercicio7 {
    
    private static Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("Introduce una vocal (S-Soltero, C-Casado, V-Viudo y D-Divorciado): ");
        char vocal = teclado.nextLine().toUpperCase().charAt(0);
        System.out.println("Introduce una edad: ");
        int edad = Integer.parseInt(teclado.nextLine());

        // if (vocal == 'S' || vocal == 'D' && edad < 35) {
        //     System.out.println("Porcentaje de retención del 12%");
        // }
        // if (edad >= 50) {
        //     System.out.println("Porcentaje de retención del 8.5%");
        // }
        // if (vocal == 'V' || vocal == 'C' && edad < 35) {
        //     System.out.println("Porcentaje de retención del 11.3%");
        // } 

            switch (vocal) {
                case 'S', 'D':
                    if (edad < 35) {
                        System.out.println("Porcentaje de retención del 12%");
                    }
                    break;
                case 'V', 'C':
                if (edad < 35) {
                    System.out.println("Porcentaje de retención del 11.3%");
                }
                break;
                default:
                if (edad > 50) {
                    System.out.println("Porcentaje de retención del 10.5%");
                }
                    break;
            }

    }

}
