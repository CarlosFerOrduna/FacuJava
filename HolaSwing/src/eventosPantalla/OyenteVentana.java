package eventosPantalla;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class OyenteVentana implements WindowListener {

	public OyenteVentana() {

	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("ventana abierta");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("se cerro la ventana");
	}

	@Override
	public void windowClosed(WindowEvent e) {
		System.out.println("ventana cerrada");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		System.out.println("ventana minimizada");
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		System.out.println("se volvio a abrir la ventana");
	}

	@Override
	public void windowActivated(WindowEvent e) {
		System.out.println("ventana activada");
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		System.out.println("ventana desactivada");
	}

}
