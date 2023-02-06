public class Ejercicio1 {
    
    public static void main(String[] args) {

        for (int i = 0; i <= 100; i++) {
            if( i%7 == 0) {
                System.out.printf("El número %d es múltiplo de 7\n", i);
            }
            if (i %13 == 0) {
                System.out.printf("El número %d es múltiplo de 13\n", i);
            }
        }
        
    }

}
