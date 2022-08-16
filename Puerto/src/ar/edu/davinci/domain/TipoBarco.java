package ar.edu.davinci.domain;

public enum TipoBarco {

	VELERO(100.0), YATE(200.0), CATAMARAN(150.0), LANCHA(50.0), MOTO_AGUA(25.0);

	private Double precio;

	TipoBarco(Double precio) {
		this.precio = precio;
	}

	public Double getPrecio() {
		return precio;
	}

}
