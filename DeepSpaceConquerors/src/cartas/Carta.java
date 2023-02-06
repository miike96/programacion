package cartas;

public abstract class Carta {

    //Atributos
    private String nombre;
    private int precio;

    /**
     * Constructor de la clase Carta con parámetros
     * @param nombre
     * @param precio
     */
    public Carta(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * Devuelve el nombre de la carta que no puede ser modificado por las clases hijas
     * @return
     */
    public final String getNombre() {
        return nombre;
    }

    /**
     * Devuelve el precio de la carta que no puede ser modificado por las clases hijas
     * @return
     */

    public final int getPrecio() {
        return precio;
    }
    
}
