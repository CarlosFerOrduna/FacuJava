package com.holajdbc;

import java.sql.SQLException;
import java.util.List;

public class Principal {

	public static void main(String[] args) {

		FacturaRepository facturaRepository = new FacturaRepository();
		Factura factura = new Factura(2, "ordenador", 350);

		try {
			facturaRepository.inserta(factura);

		} catch (SQLException e1) {
			e1.printStackTrace();
		}

		try {

			List<Factura> facturas = facturaRepository.getAll();

			for (Factura factura2 : facturas) {
				System.out.println(factura2.getNumero());
				System.out.println(factura2.getConcepto());
				System.out.println(factura2.getImporte());
			}
		} catch (Exception e) {

		}
	}

}
