package boletin6.ejercicio7;

import java.util.HashSet;
import java.util.LinkedList;

public class Receta {
	private String nombreReceta;
	private int minutosDePreparacion;
	private HashSet<Ingrediente> ingredientes;
	private LinkedList<String> pasos;
	
	public Receta(String nombreReceta, int minutosPreparacion) throws RecetaException {
		this.nombreReceta = nombreReceta.toUpperCase();
		setMinutosDePreparacion(minutosPreparacion);
		ingredientes=new HashSet<Ingrediente>();
		pasos=new LinkedList<String>();
	}

	public int getMinutosDePreparacion() {
		return minutosDePreparacion;
	}

	public void setMinutosDePreparacion(int minutosDePreparacion) throws RecetaException {
		if (minutosDePreparacion <=0) {
			throw new RecetaException("Minutos incorrectos");
		}
		this.minutosDePreparacion = minutosDePreparacion;
	}

	public String getNombreReceta() {
		return nombreReceta;
	}
	
	public void annadirPasoAlFinal(String paso) {
		pasos.add(paso.toUpperCase());
	}

	/**
	 * Método que añade un ingrediente a la receta si no está ya en ella, si el ingrediente ya está en la receta, sumará la cantidad a lo que necesitamos
	 * @param ingredienteNuevo
	 */
	public void annadirIngrediente(Ingrediente ingredienteNuevo) {

		if(ingredientes.contains(ingredienteNuevo)) {
			Ingrediente ingredienteEncontrado=null;
			for (Ingrediente ingrediente : ingredientes) {
				if(ingrediente.equals(ingredienteNuevo)) {
					ingredienteEncontrado=ingrediente;
				}
			}
			//nos puede dar un nullpointerexception si no encuentra el ingrediente
			ingredienteEncontrado.setCantidad(ingredienteEncontrado.getCantidad()+ingredienteNuevo.getCantidad());
		}else {
			ingredientes.add(ingredienteNuevo);
		}


	}
	
	/**
	 * Método que devuelve true si la receta necesita el ingrediente que le pasamos por parámetro
	 * @param nombreIngrediente
	 * @return
	 */
	public boolean necesitaIngrediente(String nombreIngrediente) {

		/*
		 * Recorro la lista de ingredientes de la receta, si encuentra el ingrediente que le pasamos por parámetro, devuelve true
		 */
		for (Ingrediente ingrediente : ingredientes) {
			//comparamos el nombre del ingrediente que le pasamos por parámetro con el nombre del ingrediente de la lista
			if(ingrediente.getNombreIngrediente().equals(nombreIngrediente.toUpperCase())) {
				return true;
			}
		}
		//si no encuentra el ingrediente, devuelve false
		return false;
		

	}

	/**
	 * Método que borra un ingrediente de la receta, también borra el paso en el que se utiliza.
	 * Si el ingrediente no está en la receta, lanza una excepción
	 * Si el ingrediente está en la receta, pero no se utiliza en ningún paso, lanza una excepción
	 * Si el ingrediente está en la receta y se utiliza en algún paso, borra el paso en el que se utiliza
	 * @param nombreIngrediente a borrar de la receta
	 * @return true si se ha borrado el ingrediente, false si no se ha borrado
	 */
	
	public void borrarIngrediente(Ingrediente ingredienteABorrar) throws RecetaException{

		/*
		 * Recorro la lista de ingredientes de la receta, si encuentra el ingrediente que le pasamos por parámetro, devuelve true
		 */
		if(ingredientes.contains(ingredienteABorrar)) {
			Ingrediente ingredienteEncontrado=null;
			for (Ingrediente ingrediente : ingredientes) {
				if(ingrediente.equals(ingredienteABorrar)) {
					ingredienteEncontrado=ingrediente;
				}
			}
			//nos puede dar un nullpointerexception si no encuentra el ingrediente
			ingredientes.remove(ingredienteEncontrado);
			//borramos el paso en el que se utiliza el ingrediente
			for (String paso : pasos) {
				if(paso.contains(ingredienteABorrar.getNombreIngrediente())) {
					pasos.remove(paso);
					return;
				}
			}
			throw new RecetaException("El ingrediente no se utiliza en ningún paso");
		}else {
			throw new RecetaException("El ingrediente no está en la receta");
		}
		
	}
	
	/**
	 * Método que añade un paso a la receta, detrás del paso que le pasamos por parámetro 
	 * Si el paso que le pasamos por parámetro no está en la receta, lanza una excepción
	 * Si el paso que le pasamos por parámetro está en la receta, añade el paso nuevo detrás del *   paso que le pasamos por parámetro
	 * @param pasoNuevo string con el paso nuevo
	 * @param pasoExistente string con el paso existente
	 * @throws RecetaException excepción que se lanza si el paso que le pasamos por parámetro no está en la receta	
	 */

	public void annadirPasoDetrasDe(String pasoNuevo, String pasoExistente) throws RecetaException{

		/*
		 * Recorro la lista de pasos de la receta, si encuentra el paso que le pasamos por parámetro, devuelve true
		 */
		if(pasos.contains(pasoExistente.toUpperCase())) {
			//añadimos el paso nuevo detrás del paso que le pasamos por parámetro
			pasos.add(pasos.indexOf(pasoExistente.toUpperCase())+1, pasoNuevo.toUpperCase());
		}else {
			throw new RecetaException("El paso no está en la receta");
		}
		
	}

	/**
	 * Método que devuelve true si la receta contiene el ingrediente que le pasamos por parámetro
	 * Si el ingrediente no está en la receta, lanza una excepción
	 * @param ingrediente a buscar en la receta 
	 * @return true si la receta contiene el ingrediente que le pasamos por parámetro
	 * @throws RecetaException excepción que se lanza si el ingrediente no está en la receta
	 */
	public boolean contieneIngrediente(String ingrediente) throws RecetaException {

		/*
		 * Recorro la lista de ingredientes de la receta, si encuentra el ingrediente que le pasamos por parámetro, devuelve true
		 */
		for (Ingrediente ingredienteReceta : ingredientes) {
			//comparamos el nombre del ingrediente que le pasamos por parámetro con el nombre del ingrediente de la lista
			if(ingredienteReceta.getNombreIngrediente().equals(ingrediente.toUpperCase())) {
				return true;
			}
		}
		//si no encuentra el ingrediente, devuelve false
		throw new RecetaException("El ingrediente no está en la receta");
		
		
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombreReceta == null) ? 0 : nombreReceta.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Receta other = (Receta) obj;
		if (nombreReceta == null) {
			if (other.nombreReceta != null)
				return false;
		} else if (!nombreReceta.equals(other.nombreReceta))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "Receta [nombreReceta=" + nombreReceta + ", ingredientes=" + ingredientes + ", pasos=" + pasos + "]";
	}
}
