package ui;

import java.awt.Graphics;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyPanel extends JPanel {

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		g.drawString("Estamos aprendiendo swing", 100, 100);

	}
}
