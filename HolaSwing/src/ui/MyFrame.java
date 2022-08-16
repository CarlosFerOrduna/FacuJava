package ui;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import eventosFoco.LaminaFoco;
import eventosMouse.EventoMouse;
import eventosMouse.EventoMouseAdaptado;
import eventosPantalla.CambiaEstadoVentana;
import eventosTeclado.EventoTeclado;

@SuppressWarnings("serial")
public class MyFrame extends JFrame {

	public MyFrame() {

		setVisible(true);

		setTitle("Hola frame");

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		Toolkit miPantalla = Toolkit.getDefaultToolkit();

		Dimension dimensionPantalla = miPantalla.getScreenSize();

		int altoPantalla = dimensionPantalla.height;

		int anchoPantalla = dimensionPantalla.width;

		setBounds(anchoPantalla / 4, altoPantalla / 4, anchoPantalla / 2, altoPantalla / 2);

		add(new LaminaFoco());
//		addMouseListener(new EventoMouseAdaptado());
//		addMouseMotionListener(new EventoMouseAdaptado());
//		addKeyListener(new EventoTeclado());
//		addWindowStateListener(new CambiaEstadoVentana());
	}
}
