package ar.edu.davinci.domain;

public class Barco {

	private TipoBarco tipo;
	private String matricula;
	private Double eslora;
	private Integer anioFabricacion;

	public Barco(TipoBarco tipo, String matricula, Double eslora, Integer anioFabricacion) {
		this.tipo = tipo;
		this.matricula = matricula;
		this.eslora = eslora;
		this.anioFabricacion = anioFabricacion;
	}

	public TipoBarco getTipo() {
		return tipo;
	}

	public void setTipo(TipoBarco tipo) {
		this.tipo = tipo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public Double getEslora() {
		return eslora;
	}

	public void setEslora(Double eslora) {
		this.eslora = eslora;
	}

	public Integer getAnioFabricacion() {
		return anioFabricacion;
	}

	public void setAnioFabricacion(Integer anioFabricacion) {
		this.anioFabricacion = anioFabricacion;
	}

}
