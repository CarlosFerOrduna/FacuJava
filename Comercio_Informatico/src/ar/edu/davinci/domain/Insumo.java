package ar.edu.davinci.domain;

class Insumo extends Producto {

	private Double porcentageGanancia;
	private TipoInsumo tipoInsumo;

	public Insumo(String nombre, Double precioLista, TipoInsumo tipoInsumo, Double porcentageGanacia) {
		super(nombre, precioLista);
		this.tipoInsumo = tipoInsumo;
		this.porcentageGanancia = porcentageGanacia;
	}

	protected TipoInsumo getTipoInsumo() {
		return tipoInsumo;
	}

	protected void setTipoInsumo(TipoInsumo tipoInsumo) {
		this.tipoInsumo = tipoInsumo;
	}

	protected Double getPorcentageGanancia() {
		return porcentageGanancia;
	}

	protected void setPorcentageGanancia(Double porcentajeGanancia) {
		this.porcentageGanancia = porcentajeGanancia;
	}

	@Override
	public Double precioVenta() {
		Double resultado = null;
		resultado = Matematica.sumarPorcentage(getPrecioLista(), getPorcentageGanancia());
		resultado = resultado * (IVA + 1);
		return resultado;
	}

	@Override
	public String toString() {
		return "Insumo [porcentajeGanancia=" + porcentageGanancia + ", tipoInsumo=" + tipoInsumo + ", nombre=" + nombre
				+ ", precioLista=" + precioLista + "]";
	}
	
	

}
