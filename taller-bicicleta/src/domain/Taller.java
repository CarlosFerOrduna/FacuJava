package domain;

public class Taller {

	private Bicicleta[] bicicletas;
	private final int CANT_BICICLETAS = 10;
	private Integer cantidadDeseada;

	public Taller() {
		this.cantidadDeseada = CANT_BICICLETAS;
		this.bicicletas = new Bicicleta[cantidadDeseada];
	}

	public Taller(Integer cantidadDeseada) {
		this.bicicletas = new Bicicleta[cantidadDeseada];
	}

	public void addBicicleta(Bicicleta bicicleta) {

		for (int i = 0; i < cantidadDeseada; i++) {

			if (bicicletas[i] != null) {

				bicicletas[i] = bicicleta;

				break;
			}
		}
	}

	public Integer cantServiciosDisponibles(Bicicleta[] bicicletas) {

		int servicio = 0;

		for (int i = 0; i < cantidadDeseada; i++) {

			if (bicicletas[i] != null) {

				if (bicicletas[i] instanceof BicicletaElectrica) {

					if (((BicicletaElectrica) bicicletas[i]).getPotencia() < 251
							&& bicicletas[i].getCantKilometro() < 2000) {

						servicio++;
					}

				} else if (bicicletas[i].getCantKilometro() < 2000) {

					servicio++;
				}
			}
		}

		return servicio;
	}
}
