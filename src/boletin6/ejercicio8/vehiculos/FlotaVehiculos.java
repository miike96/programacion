package boletin6.ejercicio8.vehiculos;

import java.util.HashMap;

public class FlotaVehiculos {
	
	private HashMap<String, Vehiculo> vehiculos;

	/**
	 *  Variable que guarda donde se insertará el siguiente vehiculo
	 *  Empieza con 0 y si vale vehiculos.length el almacen esta lleno
	 */
	private int numeroRealDeVehiculos;

    /**
     * Constructor de la clase FlotaVehiculos que inicializa el array de vehiculos
     * y el numero de vehiculos a 0
     * @throws VehiculoException
     */
	public FlotaVehiculos() throws VehiculoException {
        if (vehiculos == null) {
            vehiculos = new HashMap<String, Vehiculo>();
        } else {
            throw new VehiculoException("El array de vehiculos ya ha sido inicializado");
        }
        
	}

    /**
     * Metodo que introduce un vehiculo en el array de vehiculos de la clase
     * FlotaVehiculos si el array no esta lleno y si la matricula del vehiculo
     * no esta repetida en el array
     * @param vehiculo Vehiculo a introducir en el array de vehiculos
     * @throws VehiculoException Si el array esta lleno o si la matricula del vehiculo esta repetida
     */
	public void introducirVehiculo(Vehiculo vehiculo) throws VehiculoException {

        if (vehiculos.containsKey(vehiculo.getMatricula())) {
            throw new VehiculoException("La matricula del vehiculo ya existe");
        } else {
            vehiculos.put(vehiculo.getMatricula(), vehiculo);
        }
	
	}

    /**
     * Metodo que busca un vehiculo en el array de vehiculos de la clase
     * FlotaVehiculos por su matricula
     * @param matricula Matricula del vehiculo a buscar
     * @return Vehiculo con la matricula introducida o null si no se encuentra
     */
	public Vehiculo buscarMatricula(String matricula) {
		    
            if (vehiculos.containsKey(matricula)) {
                return vehiculos.get(matricula);
            } else {
                return null;
            }

	}

    /**
     * Metodo que calcula el precio del alquiler de un vehiculo en funcion de los dias
     * que se alquile y de su tipo
     * @param matricula Matricula del vehiculo a alquilar
     * @param dias Dias que se alquila el vehiculo
     * @return Precio del alquiler del vehiculo
     * @throws VehiculoException Si el vehiculo no existe
     */

	public double precioAlquiler(String matricula, int dias) throws VehiculoException {
            
            Vehiculo vehiculo = buscarMatricula(matricula);
            
            if (vehiculo == null || vehiculo.getMatricula() == null) {
                throw new VehiculoException("El vehiculo no existe o no tiene matricula");
            } else {
                return vehiculo.calcularAlquiler(dias);
            }
	}
	
	public String toString() {
        return vehiculos.toString();		
		
	}
}
