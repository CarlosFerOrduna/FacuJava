package com.holaspring;

public class FacturaConIva extends Factura {

	public FacturaConIva() {
		super();
	}

	public FacturaConIva(int numero, String concepto, double importe) {
		super(numero, concepto, importe);
	}

	@Override
	public double getImporteTotal() {
		return this.getImporte() * 1.21;
	}

}
