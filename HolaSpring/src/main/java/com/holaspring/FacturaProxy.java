package com.holaspring;

public class FacturaProxy extends Factura {

	private Factura factura;

	public FacturaProxy(FacturaSinIva factura) {
		this.factura = factura;
	}

	@Override
	public double getImporteTotal() {

		System.out.println("Se ha creado una factura sin IVA.");
		return factura.getImporte();

	}

	public int getNumero() {
		return factura.getNumero();
	}

	public void setNumero(int numero) {
		factura.setNumero(numero);
	}

	public String getConcepto() {
		return factura.getConcepto();
	}

	public void setConcepto(String concepto) {
		factura.setConcepto(concepto);
	}

	public double getImporte() {
		return factura.getImporte();
	}

	public void setImporte(double importe) {
		factura.setImporte(importe);
	}

}
