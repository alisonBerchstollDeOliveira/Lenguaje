package py.edu.facitec.swing_layouts.ejemplos;

import java.awt.EventQueue;

import javax.swing.JDialog;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class GridLayoutEjemplo extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GridLayoutEjemplo dialog = new GridLayoutEjemplo();
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
	public GridLayoutEjemplo() {
		setBackground(Color.GRAY);
		getContentPane().setForeground(new Color(0, 128, 0));
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new GridLayout(3, 3, 10, 10));
		
		JButton button_6 = new JButton("1");
		getContentPane().add(button_6);
		
		JButton button_3 = new JButton("3");
		getContentPane().add(button_3);
		
		JButton button_1 = new JButton("2");
		getContentPane().add(button_1);
		
		JButton button_2 = new JButton("5");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton button_4 = new JButton("4");
		getContentPane().add(button_4);
		getContentPane().add(button_2);
		
		JButton button_5 = new JButton("6");
		getContentPane().add(button_5);
		
		JButton button = new JButton("7");
		getContentPane().add(button);
		
		JButton button_7 = new JButton("8");
		getContentPane().add(button_7);
		
		JButton button_8 = new JButton("9");
		getContentPane().add(button_8);

	}

}
