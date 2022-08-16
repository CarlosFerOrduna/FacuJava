package ui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyPanel2 extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

//		g.drawRect(50, 50, 200, 200);

//		g.drawLine(50, 50, 200, 200);

//		g.drawArc(50, 50, 100, 100, 120, 150);

		Graphics2D g2 = (Graphics2D) g;

		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);

		g2.setPaint(Color.BLUE);
		g2.fill(rectangulo);

		Ellipse2D elipse = new Ellipse2D.Double();

		elipse.setFrame(rectangulo);

		g2.setPaint(new Color(0, 0, 128).brighter().darker());
		g2.fill(elipse);

//		g2.draw(new Line2D.Double(100, 100, 300, 250));
//
//		double centroEnX = rectangulo.getCenterX();
//		double centroEnY = rectangulo.getCenterY();
//		double radio = 150;
//
//		Ellipse2D circulo = new Ellipse2D.Double();
//
//		circulo.setFrameFromCenter(centroEnX, centroEnY, centroEnX + radio, centroEnY + radio);
//
//		g2.draw(circulo);
	}
}
