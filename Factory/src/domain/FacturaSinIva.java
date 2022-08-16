package domain;

public class FacturaSinIva extends Factura {

	public FacturaSinIva(int numero, String concepto, double importe) {
		super(numero, concepto, importe);
	}

	@Override
	public double getImporteTotal() {
		return this.getImporte();
	}

}
