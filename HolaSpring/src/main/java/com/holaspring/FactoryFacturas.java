package com.holaspring;

public class FactoryFacturas {

	public static Factura getInstance(String tipo) {
		if (tipo.equals("IVA")) {

			return new FacturaConIva();
		}

		else {
			return new FacturaProxy(new FacturaSinIva());
		}
	}
}
