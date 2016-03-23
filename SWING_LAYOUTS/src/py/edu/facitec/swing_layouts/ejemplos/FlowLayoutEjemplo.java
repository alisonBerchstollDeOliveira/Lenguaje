package py.edu.facitec.swing_layouts.ejemplos;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class FlowLayoutEjemplo extends JDialog {
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlowLayoutEjemplo dialog = new FlowLayoutEjemplo();
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
	public FlowLayoutEjemplo() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnA = new JButton("Boton 1");
		getContentPane().add(btnA);
		
		JButton btnB = new JButton("Boton 2");
		getContentPane().add(btnB);
		
		JButton btnC = new JButton("Boton 3");
		getContentPane().add(btnC);
		
		JButton btnD = new JButton("Boton 4");
		getContentPane().add(btnD);
		
		JButton btnE = new JButton("Boton 5");
		getContentPane().add(btnE);
		
		textField = new JTextField();
		getContentPane().add(textField);
		textField.setColumns(10);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("New radio button");
		getContentPane().add(rdbtnNewRadioButton);

	}

}
