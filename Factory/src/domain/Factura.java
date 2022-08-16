package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

	@Override
	public String toString() {
		return "Factura [numero=" + numero + ", concepto=" + concepto + ", importe=" + importe + ", lineas=" + lineas
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(concepto, importe, lineas, numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factura other = (Factura) obj;
		return Objects.equals(concepto, other.concepto)
				&& Double.doubleToLongBits(importe) == Double.doubleToLongBits(other.importe)
				&& Objects.equals(lineas, other.lineas) && numero == other.numero;
	}

}
