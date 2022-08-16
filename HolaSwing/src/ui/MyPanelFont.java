package ui;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyPanelFont extends JPanel {

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		Graphics2D g2 = (Graphics2D) g;

		Font myFont = new Font("Arial", Font.BOLD, 26);

		g2.setFont(myFont);

		g2.setBackground(new Color(128, 0, 128));

		g2.drawString("Carlos", 100, 100);

	}

}
