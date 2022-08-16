package domain;

public class FactoryFacturas {

	public static Factura getInstance(int numero, String concepto, double importe, String tipoDeFactura) {
		if (tipoDeFactura.equalsIgnoreCase("IVA")) {

			return new FacturaConIva(numero, concepto, importe);
		}

		else {
			return new FacturaSinIva(numero, concepto, importe);
		}
	}
}
