package py.edu.facitec.swing_layouts.ejemplos;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;

public class BorderLayoutEjemplo extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BorderLayoutEjemplo dialog = new BorderLayoutEjemplo();
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
	public BorderLayoutEjemplo() {
		setTitle("Ejemplo Boreder Layout");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("Border Layout Norte");
		lblNewLabel.setForeground(new Color(30, 144, 255));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 16));
		getContentPane().add(lblNewLabel, BorderLayout.NORTH);
		
		JButton btnCentro = new JButton("Centro");
		getContentPane().add(btnCentro, BorderLayout.CENTER);
		
		JButton btnEste = new JButton("Oeste");
		getContentPane().add(btnEste, BorderLayout.WEST);
		
		JButton btnOeste = new JButton("Este");
		getContentPane().add(btnOeste, BorderLayout.EAST);
		
		JLabel lblSur = new JLabel("Sur");
		lblSur.setForeground(new Color(128, 0, 0));
		lblSur.setFont(new Font("Arial", Font.BOLD, 16));
		lblSur.setHorizontalAlignment(SwingConstants.CENTER);
		getContentPane().add(lblSur, BorderLayout.SOUTH);

	}

}
