package py.edu.facitec.proyecto1.formularios;

import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JPanel;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;

import java.awt.Color;

import javax.swing.JButton;

import py.edu.facitec.proyecto1.dao.ClienteDao;
import py.edu.facitec.proyecto1.entidad.Cliente;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FormCliente extends JDialog {
	private JTextField tfCodigo;
	private JTextField tfDocumento;
	private JTextField tfNombre;
	private JTextField tfDireccion;
	private JTextField tfDireccion2;
	private JTextField tfTelefono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormCliente dialog = new FormCliente();
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
	public FormCliente() {
		setBounds(100, 100, 450, 350);
		getContentPane().setLayout(null);
		
		JLabel lblCodigo = new JLabel("Codigo:");
		lblCodigo.setBounds(10, 35, 68, 14);
		getContentPane().add(lblCodigo);
		
		tfCodigo = new JTextField();
		tfCodigo.setForeground(Color.GRAY);
		tfCodigo.setBackground(Color.ORANGE);
		tfCodigo.setBounds(88, 32, 132, 20);
		getContentPane().add(tfCodigo);
		tfCodigo.setColumns(10);
		
		JLabel lblDocumento = new JLabel("Documento:");
		lblDocumento.setBounds(10, 60, 68, 14);
		getContentPane().add(lblDocumento);
		
		tfDocumento = new JTextField();
		tfDocumento.setForeground(Color.GRAY);
		tfDocumento.setBackground(Color.ORANGE);
		tfDocumento.setBounds(88, 57, 132, 20);
		getContentPane().add(tfDocumento);
		tfDocumento.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 85, 68, 14);
		getContentPane().add(lblNombre);
		
		tfNombre = new JTextField();
		tfNombre.setForeground(Color.GRAY);
		tfNombre.setBackground(Color.ORANGE);
		tfNombre.setBounds(88, 82, 132, 20);
		getContentPane().add(tfNombre);
		tfNombre.setColumns(10);
		
		JLabel lblDireccin = new JLabel("Direcci\u00F3n:");
		lblDireccin.setBounds(10, 110, 68, 14);
		getContentPane().add(lblDireccin);
		
		tfDireccion = new JTextField();
		tfDireccion.setForeground(Color.GRAY);
		tfDireccion.setBackground(Color.ORANGE);
		tfDireccion.setBounds(88, 107, 132, 20);
		getContentPane().add(tfDireccion);
		tfDireccion.setColumns(10);
		
		tfDireccion2 = new JTextField();
		tfDireccion2.setForeground(Color.GRAY);
		tfDireccion2.setBackground(Color.ORANGE);
		tfDireccion2.setBounds(88, 138, 132, 20);
		getContentPane().add(tfDireccion2);
		tfDireccion2.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(10, 169, 68, 14);
		getContentPane().add(lblTelefono);
		
		tfTelefono = new JTextField();
		tfTelefono.setForeground(Color.GRAY);
		tfTelefono.setBackground(Color.ORANGE);
		tfTelefono.setBounds(88, 166, 132, 20);
		getContentPane().add(tfTelefono);
		tfTelefono.setColumns(10);
		
		JLabel lblSexo = new JLabel("Sexo:");
		lblSexo.setBounds(10, 194, 68, 14);
		getContentPane().add(lblSexo);
		
		JComboBox cbSexo = new JComboBox();
		cbSexo.setBackground(Color.WHITE);
		cbSexo.setBounds(88, 191, 132, 20);
		getContentPane().add(cbSexo);
		
		JRadioButton chActivo = new JRadioButton("Activo");
		chActivo.setBackground(Color.GRAY);
		chActivo.setBounds(88, 218, 132, 23);
		getContentPane().add(chActivo);
		
		JButton btnGuardar = new JButton("New button");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				registrarCliente();
			}
		});
		btnGuardar.setBackground(Color.GRAY);
		btnGuardar.setBounds(88, 278, 89, 23);
		getContentPane().add(btnGuardar);
		
		JPanel panelColor = new JPanel();
		panelColor.setBackground(Color.GRAY);
		panelColor.setBounds(0, 0, 434, 312);
		getContentPane().add(panelColor);

	}
	
	private void registrarCliente(){
		Cliente cliente = new Cliente();
		cliente.setDocumento(tfDocumento.getText());
		cliente.setNombre(tfNombre.getText());
		
		
		ClienteDao.guardarCliente(cliente); //Seteamos el valor
	}
}
