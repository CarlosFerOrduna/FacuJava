package ar.edu.davinci.domain;

import java.util.ArrayList;
import java.util.List;

public class Comercio {

	private List<Producto> productos;
	private List<Producto> historial;
	private final int LIMITE_INSUMOS = 1000;
	private final int LIMITE_FACTURAS = 10000;

	public Comercio() {

		productos = new ArrayList<Producto>(LIMITE_INSUMOS);
		historial = new ArrayList<Producto>(LIMITE_FACTURAS);
	}

	public void crearInsumo(String nombre, Double precioLista, TipoInsumo tipo, Double porcentageGanancia) {
		if (buscarProductoPorNombre(nombre) == null) {
			productos.add(new Insumo(nombre, precioLista, tipo, porcentageGanancia));
		} else {
			System.out.println("El insumo " + nombre + " ya existe.");
		}
	}

	public void crearServicioArmado(String nombre) {
		if (buscarProductoPorNombre(nombre) == null) {
			productos.add(new ServicioArmado(nombre));
		} else {
			System.out.println("El servicio de armado " + nombre + " ya existe.");
		}
	}

	public void crearServicioReparacion(String nombre, Dificultad nivelDificultas) {
		if (buscarProductoPorNombre(nombre) == null) {
			productos.add(new ServicioReparacion(nombre, nivelDificultas));
		} else {
			System.out.println("El servicio de reparación " + nombre + " ya existe.");
		}
	}

	public Producto buscarProductoPorNombre(String nombre) {
		Producto resultado = null;

		for (Producto producto : productos) {
			if (producto.getNombre().equalsIgnoreCase(nombre)) {
				resultado = producto;
			}
		}
		return resultado;
	}

	public void modificarPrecioLista(String nombre, Double precio) {
		buscarProductoPorNombre(nombre).setPrecioLista(precio);
	}

	public void addOperacion(String nombre) {

		Producto producto = buscarProductoPorNombre(nombre);

		if (producto != null) {
			try {

				Producto cloneProducto = (Producto) producto.clone();

				if (producto instanceof Servicio && ((Servicio) producto).getCantidadHoras() == null) {
					System.out.println("Debe agregar la cantidad de horas del servicio");
				} else {
					historial.add(cloneProducto);
				}

			} catch (CloneNotSupportedException e) {
				e.printStackTrace();
			}

		} else {
			System.out.println("No se pueden agregar productos nulos.");
		}

	}

	public String mostrarContenidoProductoPorNombre(String nombre) {
		String resultado = null;
		if (buscarProductoPorNombre(nombre) != null) {
			resultado = buscarProductoPorNombre(nombre).toString();
		}

		return resultado;
	}

	public void mostrarContenidoProductos() {
		for (int i = 0; i < productos.size(); i++) {
			System.out.printf("%s", productos.get(i).toString() + "\n");
		}
	}

	public void mostrarContenidoHistoria() {
		for (int i = 0; i < historial.size(); i++) {
			System.out.printf("%s", historial.get(i).toString() + "\n");
		}
	}

	public void agregarCantidadHorasServicio(String nombre, Double horas) {
		Servicio servicio = (Servicio) buscarProductoPorNombre(nombre);
		servicio.setCantidadHoras(horas);
	}

	public Integer cantidadServiciosSimples() {
		Integer resultado = 0;
		for (Producto producto : productos) {
			if (producto instanceof ServicioReparacion) {
				if (((ServicioReparacion) producto).getNivelDificultad() < 2) {
					resultado = resultado + 1;
				}
			}
		}

		return resultado;
	}

	public Double totalAPagar() {
		Double resultado = 0.0;
		for (Producto producto : historial) {
			resultado = resultado + producto.precioVenta();
		}
		return resultado;
	}

	public void cambiarPrecioLista(String nombre, Double precio) {
		Producto producto = buscarProductoPorNombre(nombre);

		producto.setPrecioLista(precio);
	}
}
