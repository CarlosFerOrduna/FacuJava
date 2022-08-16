package ar.edu.davinci.domain;

public class Puerto {

	private Alquiler[] alquileres;
	private final Integer CANTIDAD_ALQUILER = 10;
	private Integer cantidadAlquiler;

	public Puerto() {

		this.alquileres = new Alquiler[CANTIDAD_ALQUILER];
		this.cantidadAlquiler = CANTIDAD_ALQUILER;
	}

	public Puerto(Integer cantidadAmarres) {
		this.alquileres = new Alquiler[cantidadAmarres];
		this.cantidadAlquiler = cantidadAmarres;
	}
	
	public void alquilarAmarre(Barco barco) {
		for(int i = 0; i < cantidadAlquiler; i++) {
			if(alquileres[i].getAmarre().getEstado()) {
				
			}
		}
	}
}
