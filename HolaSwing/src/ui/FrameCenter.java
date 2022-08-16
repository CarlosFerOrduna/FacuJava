package ui;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FrameCenter extends JFrame {

	public FrameCenter() {

		setVisible(true);

		setTitle("Hola frame");

		Toolkit miPantalla = Toolkit.getDefaultToolkit();

		Dimension dimensionPantalla = miPantalla.getScreenSize();

		int altoPantalla = dimensionPantalla.height;

		int anchoPantalla = dimensionPantalla.width;

		setBounds(anchoPantalla / 4, altoPantalla / 4, anchoPantalla / 2, altoPantalla / 2);

//		MyPanelFont miFont = new MyPanelFont();

//		MyBola bola = new MyBola();

		MyFrameImage image = new MyFrameImage();

		add(image);
	}
}
