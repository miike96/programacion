package boletin6.ejercicio8.vehiculos;

public enum TipoCombustible {
	GASOLINA(Coche.INCREMENTO_GASOLINA),
	DIESEL(Coche.INCREMENTO_DIESEL);
	
	private double incremento;
	
	private TipoCombustible ( double incremento) {
		this.incremento=incremento;
	}
	
	public double getIncremento() {
		return incremento;
	}
}
