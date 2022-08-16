package ar.edu.davinci.domain;

public class Amarre {

	private Integer posicion;
	private Boolean estado;
	
	public Amarre(Integer posicion) {
		this.posicion = posicion;
		this.estado = false;
	}
	
	public Integer getPosicion() {
		return posicion;
	}
	
	public void setPosicion(Integer posicion) {
		this.posicion = posicion;
	}
	
	public Boolean getEstado() {
		return estado;
	}
	
	public void setEstado(Boolean estado) {
		this.estado = estado;
	}
}
