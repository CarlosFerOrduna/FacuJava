package windowFocus;

import java.awt.event.WindowEvent;
import java.awt.event.WindowFocusListener;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class FocoVentana extends JFrame implements WindowFocusListener {

	private FocoVentana marco1;
	private FocoVentana marco2;

	public void iniciar() {

		marco1 = new FocoVentana();

		marco2 = new FocoVentana();

		marco1.setVisible(true);

		marco2.setVisible(true);

		marco1.setBounds(300, 100, 600, 350);

		marco2.setBounds(1200, 100, 600, 350);

		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		marco1.addWindowFocusListener(this);

		marco2.addWindowFocusListener(this);
	}

	@Override
	public void windowGainedFocus(WindowEvent e) {

		if (e.getSource() == marco1) {

			marco1.setTitle("Tengo el foco");

		} else {

			marco2.setTitle("Tengo el foco");
		}
	}

	@Override
	public void windowLostFocus(WindowEvent e) {

		if (e.getSource() == marco1) {

			marco1.setTitle("Perdi el foco");

		} else {

			marco2.setTitle("Perdi el foco");
		}

	}

}
