package ar.edu.davinci.domain;

class ServicioReparacion extends Servicio {

	private Dificultad nivelDificultad;

	protected ServicioReparacion(String nombre, Dificultad niveDificultad) {
		super(nombre, 180.0);
		this.nivelDificultad = niveDificultad;
	}

	protected Integer getNivelDificultad() {
		return nivelDificultad.getNivelDificultad();
	}

	protected void setNivelDificultad(Dificultad nivelDificultad) {
		this.nivelDificultad = nivelDificultad;
	}

	@Override
	public Double precioVenta() {
		Double resultado = null;

		resultado = this.cantidadHoras * this.precioLista * precioPorDificultad();
		resultado = resultado * (1 + (IVA / 2));

		return resultado;
	}

	protected Double precioPorDificultad() {
		Double resultado = null;
		if (getNivelDificultad() > 1) {
			resultado = 1.25;
		} else {
			resultado = 1.0;
		}

		return resultado;
	}

	@Override
	public String toString() {
		return "ServicioReparacion [nivelDificultad=" + nivelDificultad + ", cantidadHoras=" + cantidadHoras
				+ ", nombre=" + nombre + ", precioLista=" + precioLista + "]";
	}

}
