package ejercicio2;
/**
 * Enumerado Gama con los valores BAJA, MEDIA y ALTA
 * y con el precio de cada gama
 */
public enum Gama {

    // valores del enumerado y precio de cada gama

    BAJA(30), MEDIA(40), ALTA(50);

    public double precio;

    /**
     * Constructor de la clase Gama que recibe como parámetro el precio de la gama
     * @param precio
     */
    private Gama(double precio) {
        this.precio = precio;
    }

    // getters

    // Devuelve el precio de la gama
    public double getPrecio() {
        return precio;
    }
    
}
