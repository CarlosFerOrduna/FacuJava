package ar.edu.davinci.domain;

class ServicioArmado extends Servicio {

	public ServicioArmado(String nombre) {
		super(nombre, 250.0);
	}

	@Override
	public Double precioVenta() {
		Double resultado = null;

		resultado = getCantidadHoras() * getPrecioLista();
		resultado = resultado * (1 +(IVA / 2));

		return resultado;
	}

	@Override
	public String toString() {
		return "ServicioArmado [cantidadHoras=" + cantidadHoras + ", nombre=" + nombre + ", precioLista=" + precioLista
				+ "]";
	}

	
}
