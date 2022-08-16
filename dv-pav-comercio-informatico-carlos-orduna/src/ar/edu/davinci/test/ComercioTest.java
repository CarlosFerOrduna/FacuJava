package ar.edu.davinci.test;

import ar.edu.davinci.domain.Comercio;
import ar.edu.davinci.domain.Dificultad;
import ar.edu.davinci.domain.TipoInsumo;

public class ComercioTest {

	public static void main(String[] args) {

		Comercio comercio = new Comercio();

		comercio.crearInsumo("Pantalla", 209.0, TipoInsumo.PERIFERICO, 50.0);
		comercio.crearInsumo("Pantalla", 209.0, TipoInsumo.PERIFERICO, 50.0);
		comercio.crearServicioArmado("Armado");
		comercio.crearServicioArmado("Armado");
		comercio.agregarCantidadHorasServicio("Armado", 2.0);
		comercio.crearServicioReparacion("Limpieza", Dificultad.UNO);
		comercio.agregarCantidadHorasServicio("Limpieza", 3.0);
		comercio.crearServicioReparacion("Limpieza", Dificultad.UNO);
		comercio.crearServicioReparacion("Cambio", Dificultad.UNO);
		comercio.agregarCantidadHorasServicio("Cambio", 6.0);
		comercio.crearServicioReparacion("Reparacion", Dificultad.UNO);
		comercio.agregarCantidadHorasServicio("Reparacion", 5.0);
		comercio.crearServicioReparacion("Agregar Poder", Dificultad.CINCO);
		comercio.agregarCantidadHorasServicio("Agregar Poder", 4.0);

		System.out.println(comercio.mostrarContenidoProductoPorNombre("Pantalla"));
		;
		System.out.println(comercio.mostrarContenidoProductoPorNombre("Pantallas"));
		;
		System.out.println(
				"---------------------------------------------------------------------------------------------------------");

		comercio.mostrarContenidoProductos();
		System.out.println(
				"---------------------------------------------------------------------------------------------------------");

		System.out.println(comercio.cantidadServiciosSimples());
		System.out.println(
				"---------------------------------------------------------------------------------------------------------");

		comercio.addOperacion("Pantalla");
		comercio.addOperacion("Armado");
		comercio.addOperacion("Cambio");
		comercio.mostrarContenidoHistoria();
		System.out.println(
				"---------------------------------------------------------------------------------------------------------");

		System.out.println(comercio.totalAPagar());

//		
//		comercio.crearServicioArmado("Armado");
//		comercio.agregarCantidadHorasServicio("Armado", 5.0);
//		comercio.addOperacion("Armado");
//		System.out.println(comercio.totalAPagar());
//		
//		System.out.println(
//				"---------------------------------------------------------------------------------------------------------");
//
//		
//		comercio.cambiarPrecioLista("Armado", 300.0);
//		comercio.mostrarContenidoProductos();
//
//		System.out.println(
//				"---------------------------------------------------------------------------------------------------------");
//		
//		System.out.println(comercio.totalAPagar());
	}

}
