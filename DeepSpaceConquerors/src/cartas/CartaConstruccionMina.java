package cartas;

import enums.TMaterial;

public class CartaConstruccionMina extends CartaConstruccion {

    //Atributos
    private int precio;
    private TMaterial material;

    
    //Constructor con parámetros de la clase CartaConstruccion que hereda de la clase CartaConstruccion
    public CartaConstruccionMina(String nombre, int precio) {
        super(nombre, precio);
        //TODO Auto-generated constructor stub
    }

    public TMaterial getMaterial() {
        return material;
    }

    //Métodos

    /**
     * Selección de material de la carta
     * @param material
     */

    public void seleccionarMaterial(TMaterial material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "CartaConstruccionMina [material=" + material + ", precio=" + precio + "]";
    }
        
}

