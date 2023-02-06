package jugadores;

import java.util.Scanner;

import cartas.CartaConstruccion;
import cartas.CartaMateriales;
import cartas.CartasNaves;

public class Jugador {

    //Método Scanner
    private Scanner teclado = new Scanner(System.in);

    //Atributos
    private String nombre;
    private int dinero;

    //Constructor con parámetros
    public Jugador(String nombre, int dinero) {
        this.nombre = nombre;
        this.dinero = dinero;
    }

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    //Métodos

    /**
     * Método para comprar cartas de naves
     * @param carta
     */

    public void comprarCartaNave(CartasNaves carta) {
        if (dinero >= carta.getPrecio()) {
            dinero -= carta.getPrecio();
            System.out.println("Has comprado la carta " + carta.getNombre());
        } else {
            System.out.println("No tienes suficiente dinero para comprar la carta " + carta.getNombre());
        }
    }

    /**
     * Método para comprar cartas de construcciones
     * @param carta
     */

    public void comprarCartaConstruccion(CartaConstruccion carta) {
        if (dinero >= carta.getPrecio()) {
            dinero -= carta.getPrecio();
            System.out.println("Has comprado la carta " + carta.getNombre());
        } else {
            System.out.println("No tienes suficiente dinero para comprar la carta " + carta.getNombre());
        }
    }

    /**
     * Método para comprar cartas de materia prima
     * @param carta 
     */

    public void comprarCartaMateriaPrima(CartaMateriales carta) {
        if(dinero >= carta.getPrecio()) {
            dinero -= carta.getPrecio();
            System.out.println("Has comprado la carta " + carta.getNombre());
        } else {
            System.out.println("No tienes suficiente dinero para comprar la carta " + carta.getNombre());
        }
    }


    /**
     * Método para mostrar las opciones del jugador
     */

    public void opciones() {
        System.out.println("Elige una opcion: ");
        System.out.println("-----------------------------------------------------");
        System.out.println("1. Comprar cartas de naves");
        System.out.println("2. Comprar cartas de construcciones");
        System.out.println("3. Coger una carta del mazo de materia prima");
        System.out.println("4. Construir");
        System.out.println("5. Mover una nave a otro planeta");
        System.out.println("6. Atacar");
        System.out.println("7. Transportar carga");
        System.out.println("8. Transportar pasajeros");
        System.out.println("9. Mejorar una nave");
        System.out.println("10. Reparar");
        System.out.println("11. Monstrar informacion de los planetas");
        System.out.println("12. Pasar turno");
        System.out.println("-----------------------------------------------------");
    }

    /**
     * Método menú del jugador
     */

    public void menu() {
        opciones();
        int opcion = 0;
        do {
            System.out.println("Elige una opcion: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Has elegido comprar cartas de naves");
                    break;
                case 2:
                    System.out.println("Has elegido comprar cartas de construcciones");
                    break;
                case 3:
                    System.out.println("Has elegido coger una carta del mazo de materia prima");
                    break;
                case 4:
                    System.out.println("Has elegido construir");
                    break;
                case 5:
                    System.out.println("Has elegido mover una nave a otro planeta");
                    break;
                case 6:
                    System.out.println("Has elegido atacar");
                    break;
                case 7:
                    System.out.println("Has elegido transportar carga");
                    break;
                case 8:
                    System.out.println("Has elegido transportar pasajeros");
                    break;
                case 9:
                    System.out.println("Has elegido mejorar una nave");
                    break;
                case 10:
                    System.out.println("Has elegido reparar");
                    break;
                case 11:
                    System.out.println("Has elegido mostrar informacion de los planetas");
                    break;
                case 12:
                    System.out.println("Has elegido pasar turno");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 12);
    }

    @Override
    public String toString() {
        return "Jugador [dinero=" + dinero + ", nombre=" + nombre + "]";
    }

    
}
