package ejercicio2;

public class Microbus extends Vehiculos {

    // Declaramos una constante para el precio del microbus por plaza
    private static final double PRECIO_PLAZA = 5.0;

    // numero de plazas
    private int plazas;

    /**
     * Constructor de la clase Microbus que recibe como parámetros la gama, el tipo
     * de combustible, la matrícula y el número de plazas
     * con excepciones
     * 
     * @param gama
     * @param tipoCombustible
     * @param matricula
     * @param plazas
     * @throws VehiculosException
     */

    public Microbus(Gama gama, TipoCombustible tipoCombustible, String matricula, int plazas)
            throws VehiculosException {
                super(gama, tipoCombustible, matricula);
                if(!Microbus.hayPlazasDisponibles(plazas)){
                    throw new VehiculosException("No hay plazas disponibles");
                }
        
        this.plazas = plazas;

    }

    //metodo booleano que compruebe si hay plazas disponibles
    public static boolean hayPlazasDisponibles(int plazas) {
        return plazas > 0 && plazas <= 21;
    }

    //getters

    public int getPlazas() {
        return plazas;
    }

    /**
     * Devuelve el precio del alquiler del microbus por dia en base al numero de
     * plazas
     * 
     * @precio base + precio del microbus por plaza
     * @return precio del alquiler del microbus por dia en base al numero de plazas
     */
    @Override
    public double getPrecioBase() {
        // Cuanto cuesta el alquiler del microbus por dia en base al numero de plazas
        return super.getPrecioBase() + PRECIO_PLAZA * plazas;
    }

    @Override
    public String toString() {
        return "Microbus [plazas = " + plazas + ", toString() = " + super.toString() + "]";
    }
}
