package py.edu.facitec.swing_layouts.ejemplos;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CardLayoutEjemplo extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CardLayoutEjemplo dialog = new CardLayoutEjemplo();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	private JPanel panel1;
	private JPanel panel2;

	/**
	 * Create the dialog.
	 */
	public CardLayoutEjemplo() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new CardLayout(0, 0));
		
		panel1 = new JPanel();
		getContentPane().add(panel1, "name_5052554638491");
		panel1.setLayout(null);
		
		JLabel lblCliente = new JLabel("Adolfo");
		lblCliente.setBounds(65, 14, 46, 14);
		panel1.add(lblCliente);
		
		JLabel lblMasterTelecomunicaciones = new JLabel("Master Telecomunicaciones");
		lblMasterTelecomunicaciones.setBounds(65, 39, 210, 14);
		panel1.add(lblMasterTelecomunicaciones);
		
		JLabel label = new JLabel("0984702873");
		label.setBounds(65, 64, 100, 14);
		panel1.add(label);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				siguienteTarjeta();
			}
		});
		btnSiguiente.setBounds(294, 210, 89, 23);
		panel1.add(btnSiguiente);
		
		panel2 = new JPanel();
		getContentPane().add(panel2, "name_5290745572415");
		panel2.setLayout(null);
		
		JLabel lblMariel = new JLabel("Mariel ");
		lblMariel.setBounds(57, 11, 46, 14);
		panel2.add(lblMariel);
		
		JLabel lblIbmHardware = new JLabel("IBM Hardware");
		lblIbmHardware.setBounds(57, 36, 115, 14);
		panel2.add(lblIbmHardware);
		
		JLabel label_1 = new JLabel("0985642310");
		label_1.setBounds(57, 60, 76, 14);
		panel2.add(label_1);
		
		JButton btnAnterior = new JButton("Anterior");
		btnAnterior.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				anteriorTarjeta();
			}
		});
		btnAnterior.setBounds(10, 228, 89, 23);
		panel2.add(btnAnterior);

	}
	//Metodo que oculta la primera tarjeta (Card) y muestra la siguiente
	private void siguienteTarjeta() {
		panel1.setVisible(false);
		panel2.setVisible(true);
	}
	private void anteriorTarjeta() {
		panel1.setVisible(true);
		panel2.setVisible(false);
	}
}
