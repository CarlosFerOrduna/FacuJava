package domain;

public abstract class Bicicleta {

	private String marca;
	private String modelo;
	private Integer cantKilometro;

	public Bicicleta(String marca, String modelo, Integer cantKilometro) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.cantKilometro = cantKilometro;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getCantKilometro() {
		return cantKilometro;
	}

	public void setCantKilometro(Integer cantKilometro) {
		this.cantKilometro = cantKilometro;
	}

	@Override
	public String toString() {
		return "Bicicleta [marca=" + marca + ", modelo=" + modelo + ", cantKilometro=" + cantKilometro + "]";
	}
	
	public abstract boolean enCondiciones();
}
