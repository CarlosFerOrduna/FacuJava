package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyBola extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		Ellipse2D bola = new Ellipse2D.Double();

		bola.setFrame(0, 0, 30, 30);

		g2.setPaint(new Color(128, 0, 128));
		g2.fill(bola);
	}
}
