package domain;

public class BicicletaElectrica extends Bicicleta {

	private Double potencia;

	public BicicletaElectrica(String marca, String modelo, Integer cantKilometro, Double potencia) {
		super(marca, modelo, cantKilometro);
		this.potencia = potencia;
	}

	public Double getPotencia() {
		return potencia;
	}

	public void setPotencia(Double potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "BicicletaElectrica [potencia=" + potencia + ", toString()=" + super.toString() + "]";
	}

	@Override
	public boolean enCondiciones() {
		return false;
	}

}
