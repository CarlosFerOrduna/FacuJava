package com.holaspring;

import java.util.ArrayList;
import java.util.List;

public abstract class Factura {

	private int numero;
	private String concepto;
	private double importe;
	private List<LineaFactura> lineas = new ArrayList<LineaFactura>();

	public Factura(int numero, String concepto, double importe) {
		this.numero = numero;
		this.concepto = concepto;
		this.importe = importe;
	}

	public List<LineaFactura> getLineas() {
		return lineas;
	}

	public void setLineas(List<LineaFactura> lineas) {
		this.lineas = lineas;
	}

	public Factura() {
		super();
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getConcepto() {
		return concepto;
	}

	public void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	public abstract double getImporteTotal();

}
