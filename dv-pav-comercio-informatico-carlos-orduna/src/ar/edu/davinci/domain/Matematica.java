package ar.edu.davinci.domain;

interface Matematica {

	Double precioVenta();

	public static Double sumarPorcentage(Double valor, Double porcentage) {
		Double resultado = 0.0;
		Double delta = (valor.doubleValue() * porcentage.doubleValue() / 100);
		resultado = valor + delta;
		return resultado;
	}
}
