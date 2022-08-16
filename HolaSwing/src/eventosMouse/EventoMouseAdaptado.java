package eventosMouse;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class EventoMouseAdaptado extends MouseAdapter implements MouseMotionListener {

	public void mouseClicked(MouseEvent e) {

		System.out.println("Cordenadoa X " + e.getX() + " Cordenada Y " + e.getY());
		System.out.println("Cantidad de clicks: " + e.getClickCount());

	}

	public void mousePressed(MouseEvent e) {

		System.out.println(e.getModifiersEx());
	}

	public void mouseDragged(MouseEvent e) {
		
		System.out.println("Estas arrastrando");
	}

	public void mouseMoved(MouseEvent e) {
		System.out.println("Estas moviendo el raton");
	}
}
