package py.edu.facitec.swing_events.ejemplos;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class EjemploEventos extends JDialog {
	private JTextField tfNombre;
	private JTextField tfApellido;
	private JTextField tfDocumento;
	private JLabel lblError;
	private JLabel lblApellidoFocusGained;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjemploEventos dialog = new EjemploEventos();
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
	public EjemploEventos() {
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(10, 11, 65, 14);
		getContentPane().add(lblNombre);
		
		JLabel lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(10, 36, 65, 14);
		getContentPane().add(lblApellido);
		
		JLabel lblDocumento = new JLabel("Documento");
		lblDocumento.setBounds(10, 61, 65, 14);
		getContentPane().add(lblDocumento);
		
		tfNombre = new JTextField();
		tfNombre.addKeyListener(new KeyAdapter() {
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					tfApellido.requestFocus();
				}
			}
		});
		tfNombre.setBounds(85, 8, 160, 20);
		getContentPane().add(tfNombre);
		tfNombre.setColumns(10);
		//se agrega el escuchador del teclado
		tfApellido = new JTextField();
		tfApellido.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent arg0) {
				lblApellidoFocusGained.setText("Mouse en Apellido");
			}
			@Override
			public void mouseExited(MouseEvent arg0) {
				lblApellidoFocusGained.setText("");
			}
		});
		tfApellido.addFocusListener(new FocusAdapter() {
			public void focusGained(FocusEvent arg0) {
				lblApellidoFocusGained.setText("Foco Apellido");
				
			}
			public void focusLost(FocusEvent arg0) {
				lblApellidoFocusGained.setText("");
			}
		});
		tfApellido.addKeyListener(new KeyAdapter() {
			//si se preciona enter pasa el foco a documento
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode() == KeyEvent.VK_ENTER) {
					tfDocumento.requestFocus();
				}
			}
		});
		tfApellido.setBounds(85, 33, 160, 20);
		getContentPane().add(tfApellido);
		tfApellido.setColumns(10);
		
		tfDocumento = new JTextField();
		tfDocumento.addKeyListener(new KeyAdapter() {
			public void keyTyped(KeyEvent e) {
				char c= e.getKeyChar();
				if (!Character.isDigit(c)) {
					e.consume();
				}
			}
			
			public void keyReleased(KeyEvent e) {
				char c= e.getKeyChar();
				if (!Character.isDigit(c)) {
					lblError.setText("Solo numeros");
				}else {
					lblError.setText("");
				}
			}
		});
		tfDocumento.setBounds(85, 58, 86, 20);
		getContentPane().add(tfDocumento);
		tfDocumento.setColumns(10);
		
		lblError = new JLabel("");
		lblError.setBounds(181, 61, 130, 14);
		getContentPane().add(lblError);
		
		lblApellidoFocusGained = new JLabel("");
		lblApellidoFocusGained.setBounds(255, 36, 130, 14);
		getContentPane().add(lblApellidoFocusGained);

	}
}
