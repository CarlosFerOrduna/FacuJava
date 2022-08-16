package ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class PainFrame extends JFrame {

	public PainFrame() {

		setVisible(true);

		Toolkit miPantalla = Toolkit.getDefaultToolkit();

		Dimension dimensionPantalla = miPantalla.getScreenSize();

		int anchoPantalla = dimensionPantalla.width;

		int altoPantalla = dimensionPantalla.height;

		setBounds(anchoPantalla / 4, altoPantalla / 4, anchoPantalla / 2, altoPantalla / 2);

		setTitle("Que ondaaaa");

		setDefaultCloseOperation(EXIT_ON_CLOSE);

		MyPanel2 myPanel = new MyPanel2();

		myPanel.setBackground(new Color(129, 0, 128));

		MyPanelFont myPanelFont = new MyPanelFont();

		add(myPanel);
		add(myPanelFont);

	}

}
