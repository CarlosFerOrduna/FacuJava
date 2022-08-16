package ui;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MyFrameImage extends JPanel {

	private Image image;

	public MyFrameImage() {
	
	}

	Toolkit miPantalla = Toolkit.getDefaultToolkit();

	Dimension dimensionPantalla = miPantalla.getScreenSize();

	int altoPantalla = dimensionPantalla.height;

	int anchoPantalla = dimensionPantalla.width;

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		try {

			image = ImageIO.read(new File("src/image/descarga.jfif"));

		} catch (IOException e) {

			System.out.println("No encuentro la imagen");
		}

		
		g.drawImage(image, 0, 0, null);

		for (int i = 0; i < anchoPantalla; i++) {
			for (int j = 0; j < altoPantalla; j++) {
				g.copyArea(0, 0, image.getWidth(this), image.getHeight(this), image.getWidth(this) * i,
						image.getHeight(this) * j);
			}
		}

	}
}
