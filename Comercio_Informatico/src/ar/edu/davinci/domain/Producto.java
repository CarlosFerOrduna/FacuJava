package ar.edu.davinci.domain;

abstract class Producto implements Matematica, Cloneable {

	protected String nombre;
	protected Double precioLista;
	protected static final Double IVA = 0.21;

	protected Producto(String nombre, Double precioLista) {

		this.nombre = nombre;
		this.precioLista = precioLista;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected Double getPrecioLista() {
		return precioLista;
	}

	protected void setPrecioLista(Double precioLista) {
		this.precioLista = precioLista;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precioLista=" + precioLista + "]";
	}

}
