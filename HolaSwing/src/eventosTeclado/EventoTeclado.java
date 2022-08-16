package eventosTeclado;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EventoTeclado implements KeyListener {

	@Override
	public void keyTyped(KeyEvent e) {
		// cuando pasan las dos cosas
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// cuando apretas una tecla
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// cuando sueltas la tecla

		System.out.println(e.getKeyCode());
		System.out.println(e.getKeyChar());
	}

}
