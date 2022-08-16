package eventosPantalla;

import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;

public class CambiaEstadoVentana implements WindowStateListener {

	@Override
	public void windowStateChanged(WindowEvent e) {
		System.out.println("la ventana a cambiado de estado");

		if (e.getNewState() == 6) {
			System.out.println("ventana completa");
		}
	}

}
