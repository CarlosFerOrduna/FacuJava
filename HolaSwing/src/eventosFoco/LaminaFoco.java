package eventosFoco;

import java.awt.Graphics;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;

import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class LaminaFoco extends JPanel {

	private JTextField cuadro1;
	private JTextField cuadro2;

	public void paintComponent(Graphics g) {

		super.paintComponent(g);

		cuadro1 = new JTextField();
		cuadro2 = new JTextField();

		setLayout(null);
		cuadro1.setBounds(120, 10, 150, 20);
		cuadro2.setBounds(120, 50, 150, 20);

		add(cuadro1);
		add(cuadro2);

		EventoFoco eventos = new EventoFoco();

		cuadro1.addFocusListener(eventos);
	}

	public class EventoFoco implements FocusListener {

		@Override
		public void focusGained(FocusEvent e) {
			// cuando el objeto gana el foco

		}

		@Override
		public void focusLost(FocusEvent e) {
			// cuando el objeto pierde el foco

			String email = cuadro1.getText();

			boolean validador = false;

			for (int i = 0; i < email.length(); i++) {

				if (email.charAt(i) == '@') {

					validador = true;
				}
			}

			if (validador) {
				System.out.println("Correcto");
			}else {
				System.out.println("No es correcto");
			}
		}

	}

}
