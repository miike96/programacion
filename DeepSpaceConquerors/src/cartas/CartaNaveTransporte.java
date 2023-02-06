package cartas;


import interfaces.Itransportable;
import planetas.Planeta;

public class CartaNaveTransporte extends CartasNaves implements Itransportable {

    
    /**
     * Constructor de la clase CartaNaveTransporte con parámetros
     * @param nombre
     * @param precio
     */

    public CartaNaveTransporte(String nombre, int precio) {
        super(nombre, precio);
        //TODO Auto-generated constructor stub
    }

    /**
     * Método que transporta personas de un planeta a otro
     * @param planeta
     * @param personas 
     */
    @Override
    public void transportar(Planeta planeta, int personas) {
        // TODO Auto-generated method stub
        
    }
    
}
