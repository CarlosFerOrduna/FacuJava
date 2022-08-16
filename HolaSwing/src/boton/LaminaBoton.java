package boton;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class LaminaBoton extends JPanel implements ActionListener {

	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");

	public LaminaBoton() {
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);

		botonAzul.addActionListener(this);
		botonAmarillo.addActionListener(this);
		botonRojo.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Object botonPulzado = e.getSource();

		if (botonPulzado == botonAzul) {

			setBackground(Color.BLUE);
		} else if (botonPulzado == botonAmarillo) {
			
			setBackground(Color.YELLOW);
		}else {
			setBackground(Color.RED);
		}
	}
}
