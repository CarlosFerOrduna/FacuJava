package ar.edu.davinci.domain;

public class Alquiler {

	private Cliente cliente;
	private Integer fechaInicial;
	private Integer finalAlquiler;
	private Amarre amarre;
	private Barco barco;
	
	public Alquiler(Cliente cliente, Integer fecheInicial, Integer finalAlquiler, Amarre amarre, Barco barco) {
		this.cliente = cliente;
		this.fechaInicial = fecheInicial;
		this.finalAlquiler = fecheInicial;
		this.amarre = amarre;
		this.barco = barco;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Integer getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaInicial(Integer fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public Integer getFinalAlquiler() {
		return finalAlquiler;
	}

	public void setFinalAlquiler(Integer finalAlquiler) {
		this.finalAlquiler = finalAlquiler;
	}

	public Amarre getAmarre() {
		return amarre;
	}

	public void setAmarre(Amarre amarre) {
		this.amarre = amarre;
	}

	public Barco getBarco() {
		return barco;
	}

	public void setBarco(Barco barco) {
		this.barco = barco;
	}
	
	
}
