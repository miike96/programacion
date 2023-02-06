package ejercicio2;

public class Coche extends Vehiculos {

    // Precio de cada tipo de combustible
    private static final double PRECIO_GASOLINA = 3.5;
    private static final double PRECIO_DIESEL = 2.0;

    /**
     * Constructor de la clase Coche que recibe como parámetros la gama, el tipo de combustible y la matrícula
     * con excepciones
     * @param gama
     * @param tipoCombustible
     * @param matricula
     * @throws VehiculosException
     */
    
    public Coche(Gama gama, TipoCombustible tipoCombustible, String matricula) throws VehiculosException {
        super(gama, tipoCombustible, matricula);
    }

    /**
     * Devuelve el precio del alquiler del coche por dia en base al tipo de combustible
     * @precio base + precio del combustible
     * @return precio del alquiler del coche por dia en base al tipo de combustible
     */
    @Override
    public double getPrecioBase() {
        //Cuanto cuesta el alquiler del coche por dia en base al tipo de combustible

        double precio;
        switch (this.getTipoCombustible()) {
            case GASOLINA:
                precio = PRECIO_GASOLINA;
                break;
            case DIESEL:
                precio = PRECIO_DIESEL;
                break;
            default:
                precio = 0;
                break;
        }
        return super.getPrecioBase() + precio;
    }

    @Override
    public String toString() {
        return "Coche [toString()=" + super.toString() + "]";
    }

}
