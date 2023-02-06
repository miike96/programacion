package ejercicio2;

public class Furgoneta extends Vehiculos {

    // Precio de cada kilo de peso máximo autorizado (PMA)
    private static final double PRECIO_PMA = 0.5;

    // Peso máximo autorizado (PMA)
    private double pma;

    /**
     * Constructor de la clase Furgoneta que recibe como parámetros la gama, el tipo
     * de combustible, la matrícula y el peso máximo autorizado (PMA)
     * con excepciones
     * 
     * @param gama
     * @param tipoCombustible
     * @param matricula
     * @param pma
     * @throws VehiculosException
     */

    public Furgoneta(Gama gama, TipoCombustible tipoCombustible, String matricula, double pma)
            throws VehiculosException {
        super(gama, tipoCombustible, matricula);
        if (!Furgoneta.hayPmaDisponible(pma)) {
            throw new VehiculosException("No hay PMA disponible");
        }
        this.pma = pma;

    }

    // getters

    public double getPma() {
        return pma;
    }

    /**
     * Devuelve el precio del alquiler de la furgoneta por dia en base al peso
     * máximo
     * autorizado (PMA)
     * 
     * @precio base + precio del furgoneta por PMA
     * @return precio del alquiler de la furgoneta por dia en base al peso máximo
     *         autorizado (PMA)
     */
    @Override
    public double getPrecioBase() {
        // Cuanto cuesta el alquiler de la furgoneta por dia en base al peso máximo
        // autorizado (PMA)
        return super.getPrecioBase() + PRECIO_PMA * pma;
    }

    // metodo booleano que compruebe si hay PMA disponible
    public static boolean hayPmaDisponible(double pma) {
        return pma > 0 && pma <= 3500;

    }

    @Override
    public String toString() {
        return "Furgoneta [pma=" + pma + ", toString()=" + super.toString() + "]";
    }

}
