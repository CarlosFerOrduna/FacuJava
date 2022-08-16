package eventosMouse;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class EventoMouse implements MouseListener {

	@Override
	public void mouseClicked(MouseEvent e) {
		// Cuando hice clic con el raton

		System.out.println("Hiciste click");
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("apretaste el click");
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("soltaste el click");
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("acabas de entrar");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("acabas de salir");
	}

}
