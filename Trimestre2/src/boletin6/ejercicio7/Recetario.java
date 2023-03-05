package boletin6.ejercicio7;

import java.util.HashMap;

public class Recetario {

	private HashMap<String, Receta> recetas;
	
	public Recetario() {
		recetas=new HashMap<String,Receta>();
	
	}
	
	/**
	 * Método que añade una receta al recetario, si la receta ya existe, lanzará una excepción
	 * @param nuevaReceta receta que se quiere añadir al recetario
	 * @throws RecetaException
	 */
	public void annadirReceta( Receta nuevaReceta) throws RecetaException {

		//con el containsKey, si la receta ya existe, devolverá true, y si no existe, devolverá false
		if(recetas.containsKey(nuevaReceta.getNombreReceta())) {
			throw new RecetaException("La receta ya existe");
		}else {
			recetas.put(nuevaReceta.getNombreReceta(), nuevaReceta);
		}
		
		
	}
	/**
	 * Método que devuelve un String con el listado de recetas ordenadas alfabéticamente
	 * @return String con el listado de recetas ordenadas alfabéticamente
	 * @throws RecetaException excepción que se lanza si no hay recetas en el recetario
	 */
	public String listadoRecetasOrdenadasAlfabeticamente() throws RecetaException {
		/*
		 * lo haremos con un stringbuilder, porque es más eficiente que concatenar strings
		 */
		StringBuilder listado=new StringBuilder();
		//si no hay recetas, lanzamos la excepción
		if(recetas.isEmpty()) {
			throw new RecetaException("No hay recetas");
		}else {
			//recorremos el hashmap con un for each
			for (Receta receta : recetas.values()) {
				//añadimos el nombre de la receta al listado
				listado.append(receta.getNombreReceta());
				//añadimos un salto de línea
				listado.append("\n");
			}
		}
		//devolvemos el listado
		return listado.toString();
		
		
	}
	

	/**
	 * Método que devuelve un String con el listado de recetas que contienen el ingrediente que le pasamos por parámetro, ordenadas por tiempo de preparación
	 * @param ingrediente ingrediente que debe contener la receta
	 * @return String con el listado de recetas que contienen el ingrediente que le pasamos por parámetro, ordenadas por tiempo de preparación
	 * @throws RecetaException excepción que se lanza si no hay recetas en el recetario
	 */
	public String listadoRecetasConIngredienteOrdenadasPorTiempoPreparacion(String ingrediente) throws RecetaException{

		/*
		 * lo haremos con un stringbuilder, porque es más eficiente que concatenar strings
		 */
		StringBuilder listado=new StringBuilder();
		//si no hay recetas, lanzamos la excepción
		if(recetas.isEmpty()) {
			throw new RecetaException("No hay recetas");
		}else {
			//recorremos el hashmap con un for each
			for (Receta receta : recetas.values()) {
				//si la receta contiene el ingrediente, lo añadimos al listado
				if(receta.contieneIngrediente(ingrediente)) {
					listado.append(receta.getNombreReceta());
					listado.append("\n");
				}
			}
		}
		//devolvemos el listado
		return listado.toString();
	}

	@Override
	public String toString() {
		return "Recetario [recetas=" + recetas + "]";
	}
}
