package domain;

public class BicicletaClasica extends Bicicleta {

	public BicicletaClasica(String marca, String modelo, Integer cantKilometro) {
		super(marca, modelo, cantKilometro);
	}

	@Override
	public boolean enCondiciones() {
		return false;
	}

}
