/**
 * @author Miguel López Rodríguez
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 11; i++) { // Iteramos desde 1 hasta 10
            System.out.println("Tabla del " + i + ":");
            for (int j = 1; j <= 11; j++) { // Iteramos desde 1 hasta 10
                System.out.println(i + " x " + j + " = " + (i * j)); // Mostramos el resultado de la multiplicación
            }
            System.out.println(); // Imprimimos una línea en blanco para separar las tablas de multiplicar

        }
        
    }
}
