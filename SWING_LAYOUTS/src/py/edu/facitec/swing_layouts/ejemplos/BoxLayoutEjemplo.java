package py.edu.facitec.swing_layouts.ejemplos;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class BoxLayoutEjemplo extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BoxLayoutEjemplo dialog = new BoxLayoutEjemplo();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public BoxLayoutEjemplo() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		
		JButton btnBoton = new JButton("Boton 1");
		getContentPane().add(btnBoton);
		
		JLabel lblLabel = new JLabel("Label");
		getContentPane().add(lblLabel);
		
		JTextArea textArea = new JTextArea();
		getContentPane().add(textArea);
		
		JButton btnBoton_1 = new JButton("Boton 2");
		getContentPane().add(btnBoton_1);

	}

}
