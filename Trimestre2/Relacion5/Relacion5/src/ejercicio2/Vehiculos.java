package ejercicio2;

public class Vehiculos {

    // Atributos de la clase Vehiculos
    private final Gama gama;

    private final TipoCombustible tipoCombustible;

    private final String matricula;

    /**
     * Constructor de la clase Vehiculos con parámetros gama, tipoCombustible y matricula
     * con excepciones
     * @param gama
     * @param combustible
     * @param matricula
     * @throws VehiculosException
     */
    public Vehiculos(Gama gama, TipoCombustible combustible, String matricula) throws VehiculosException {

        // Comprobamos que la matrícula no sea nula o vacía o en blanco
        //con el isEmpty y el isBlank compruebo que no sea nula o vacia o en blanco y si es asi lanzo la excepcion
        if (matricula == null || matricula.isEmpty() || matricula.isBlank()) {
            throw new VehiculosException("La matrícula no puede ser nula o vacía");
        }

        // Comprobamos que la matrícula tenga 4 dígitos y 3 letras mayúsculas
        //con el matches compruebo que cumple el formato de 4 digitos y 3 letras mayusculas y si no es asi lanzo la excepcion
        if (!matricula.matches("[0-9]{4}[A-Z]{3}")) {
            throw new VehiculosException("La matrícula no tiene el formato correcto");
        }

        // Comprobamos que la matrícula no empiece por 0000 (no se pueden reservar)
        //con el startsWith compruebo que empieza por 0000 y si es asi lanzo la excepcion
        if (matricula.startsWith("0000")) {
            throw new VehiculosException("La matrícula no puede empezar por 0000");
        }

        // Comprobamos que la gama y el tipo de combustible no sean nulos (no se pueden reservar)

        if(gama == null || combustible == null){
            throw new VehiculosException("La gama o el tipo de combustible no pueden ser nulos");
        }
        this.gama = gama;
        this.tipoCombustible = combustible;
        this.matricula = matricula;


    }

    //getters
    public Gama getGama() {
        return gama;
    }

    public TipoCombustible getTipoCombustible() {
        return tipoCombustible;
    }

    public double getPrecioBase() {
        return gama.getPrecio();
    }

    public String getMatricula() {
        return matricula;
    }

    //Con el getter de precio, el precio base se puede calcular en función de la gama y el tipo de combustible del vehículo.
    public double getPrecioPorDia(int diasAlquiler) throws VehiculosException {
        if (diasAlquiler < 1) {
            throw new VehiculosException("El número de días no puede ser menor que 1");
        }
        return getPrecioBase() * diasAlquiler;
    }

    @Override
    public String toString() {
        return "Vehiculos {" + " gama = " + gama + ", tipoCombustible = " + tipoCombustible + ", matricula = " + matricula + '}';
    }
}
