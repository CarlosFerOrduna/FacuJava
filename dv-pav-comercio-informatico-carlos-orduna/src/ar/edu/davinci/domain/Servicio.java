package ar.edu.davinci.domain;

abstract class Servicio extends Producto {

	protected Double cantidadHoras;

	protected Servicio(String nombre, Double precioLista) {
		super(nombre, precioLista);
	}

	protected Double getCantidadHoras() {
		return cantidadHoras;
	}

	protected void setCantidadHoras(Double cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}

}
