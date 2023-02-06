package cartas;

public class CartaConstruccion extends Carta {

    //Atributos
    private int precio;
    
    //Constructor con parámetros de la clase CartaConstruccion que hereda de la clase Carta
    public CartaConstruccion(String nombre, int precio) {
        super(nombre, precio);
        //TODO Auto-generated constructor stub
    }
    

    //ToString

    @Override
    public String toString() {
        return "CartaConstruccion [precio=" + precio + "]";
    }

}
