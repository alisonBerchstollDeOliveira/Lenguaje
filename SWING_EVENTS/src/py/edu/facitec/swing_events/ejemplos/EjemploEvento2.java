package py.edu.facitec.swing_events.ejemplos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class EjemploEvento2 extends JDialog {
	private JTextField tfNombre;
	private JTextField tfApellido;
	private JTextField tfCelular;
	private JLabel lblFocus;
	private JButton btnGuardar;
	private JLabel lblError;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			EjemploEvento2 dialog = new EjemploEvento2();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public EjemploEvento2() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 11, 46, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 36, 46, 14);
		getContentPane().add(lblApellido);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setBounds(10, 61, 46, 14);
		getContentPane().add(lblCelular);
		
		tfNombre = new JTextField();
		tfNombre.addKeyListener(new KeyAdapter() {
			//Captura cuando se presiona una tecla
			public void keyPressed(KeyEvent in) {
				//preguntamos si la tela que se presiono es enter
				if (in.getKeyCode()== KeyEvent.VK_ENTER) {
					//mandamos el cursor al campo apellido
					tfApellido.requestFocus();
				}
			}
		});
		tfNombre.setBounds(66, 8, 197, 20);
		getContentPane().add(tfNombre);
		tfNombre.setColumns(10);
		
		tfApellido = new JTextField();
		tfApellido.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent in) {
				lblFocus.setVisible(true);
			}
			public void focusLost(FocusEvent arg0) {
				lblFocus.setVisible(false);
			}
		});
		tfApellido.addKeyListener(new KeyAdapter() {
			
			public void keyPressed(KeyEvent in) {
				if (in.getKeyCode()==KeyEvent.VK_ENTER) {
					tfCelular.requestFocus();
				}
			}
		});
		tfApellido.setBounds(66, 33, 197, 20);
		getContentPane().add(tfApellido);
		tfApellido.setColumns(10);
		
		tfCelular = new JTextField();
		tfCelular.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent in) {
				if (in.getKeyCode()==KeyEvent.VK_ENTER) {
					btnGuardar.requestFocus();
					
				}
			}
		
			public void keyTyped(KeyEvent in) {
				char c=in.getKeyChar();
				if (in.getKeyCode() != KeyEvent.VK_ENTER || !Character.isDigit(c)) {
					in.consume();
					lblError.setVisible(true);
				}else {
					lblError.setVisible(false);
				}
			}
		});
		tfCelular.setBounds(66, 58, 197, 20);
		getContentPane().add(tfCelular);
		tfCelular.setColumns(10);
		
		btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "El nombre ingresado es: "+tfNombre.getText());
			}
		});
		btnGuardar.setBounds(179, 158, 89, 23);
		getContentPane().add(btnGuardar);
		
		lblFocus = new JLabel("Focus");
		lblFocus.setVisible(false);
		lblFocus.setBounds(273, 36, 46, 14);
		getContentPane().add(lblFocus);
		
		lblError = new JLabel("Error");
		lblError.setVisible(false);
		lblError.setBounds(273, 61, 46, 14);
		getContentPane().add(lblError);
	}
}
