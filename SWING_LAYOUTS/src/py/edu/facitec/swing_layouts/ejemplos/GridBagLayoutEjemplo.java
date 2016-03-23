package py.edu.facitec.swing_layouts.ejemplos;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JRadioButton;

public class GridBagLayoutEjemplo extends JDialog {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			GridBagLayoutEjemplo dialog = new GridBagLayoutEjemplo();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public GridBagLayoutEjemplo() {
		setBounds(100, 100, 450, 300);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{1.0, 1.0};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		{
			JLabel lblRegistroDeClientes = new JLabel("Registro de Clientes");
			lblRegistroDeClientes.setFont(new Font("Arial", Font.BOLD, 16));
			GridBagConstraints gbc_lblRegistroDeClientes = new GridBagConstraints();
			gbc_lblRegistroDeClientes.gridwidth = 3;
			gbc_lblRegistroDeClientes.insets = new Insets(0, 0, 5, 0);
			gbc_lblRegistroDeClientes.gridx = 0;
			gbc_lblRegistroDeClientes.gridy = 0;
			gbc_lblRegistroDeClientes.weightx=2;
			getContentPane().add(lblRegistroDeClientes, gbc_lblRegistroDeClientes);
		}
		
		JLabel lblNombre = new JLabel("Nombre");
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.anchor = GridBagConstraints.EAST;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 0;
		gbc_lblNombre.gridy = 2;
		getContentPane().add(lblNombre, gbc_lblNombre);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 1;
		gbc_textField.gridy = 2;
		gbc_textField.weightx=2;
		getContentPane().add(textField, gbc_textField);
		textField.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido");
		GridBagConstraints gbc_lblApellido = new GridBagConstraints();
		gbc_lblApellido.anchor = GridBagConstraints.EAST;
		gbc_lblApellido.insets = new Insets(0, 0, 5, 5);
		gbc_lblApellido.gridx = 0;
		gbc_lblApellido.gridy = 3;
		getContentPane().add(lblApellido, gbc_lblApellido);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 1;
		gbc_textField_1.gridy = 3;
		getContentPane().add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		JLabel lblCelular = new JLabel("Celular");
		GridBagConstraints gbc_lblCelular = new GridBagConstraints();
		gbc_lblCelular.anchor = GridBagConstraints.EAST;
		gbc_lblCelular.insets = new Insets(0, 0, 5, 5);
		gbc_lblCelular.gridx = 0;
		gbc_lblCelular.gridy = 4;
		getContentPane().add(lblCelular, gbc_lblCelular);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 1;
		gbc_textField_2.gridy = 4;
		getContentPane().add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		JLabel lblNumeroDeDocumento = new JLabel("Numero de Documento");
		GridBagConstraints gbc_lblNumeroDeDocumento = new GridBagConstraints();
		gbc_lblNumeroDeDocumento.anchor = GridBagConstraints.EAST;
		gbc_lblNumeroDeDocumento.insets = new Insets(0, 0, 5, 5);
		gbc_lblNumeroDeDocumento.gridx = 0;
		gbc_lblNumeroDeDocumento.gridy = 5;
		getContentPane().add(lblNumeroDeDocumento, gbc_lblNumeroDeDocumento);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 1;
		gbc_textField_3.gridy = 5;
		getContentPane().add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion");
		GridBagConstraints gbc_lblDireccion = new GridBagConstraints();
		gbc_lblDireccion.anchor = GridBagConstraints.EAST;
		gbc_lblDireccion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDireccion.gridx = 0;
		gbc_lblDireccion.gridy = 6;
		getContentPane().add(lblDireccion, gbc_lblDireccion);
		
		textField_4 = new JTextField();
		GridBagConstraints gbc_textField_4 = new GridBagConstraints();
		gbc_textField_4.gridheight = 2;
		gbc_textField_4.insets = new Insets(0, 0, 5, 5);
		gbc_textField_4.fill = GridBagConstraints.BOTH;
		gbc_textField_4.gridx = 1;
		gbc_textField_4.gridy = 6;
		getContentPane().add(textField_4, gbc_textField_4);
		textField_4.setColumns(10);
		
		JRadioButton rdbtnActivo = new JRadioButton("Activo");
		GridBagConstraints gbc_rdbtnActivo = new GridBagConstraints();
		gbc_rdbtnActivo.anchor = GridBagConstraints.WEST;
		gbc_rdbtnActivo.insets = new Insets(0, 0, 5, 5);
		gbc_rdbtnActivo.gridx = 1;
		gbc_rdbtnActivo.gridy = 8;
		getContentPane().add(rdbtnActivo, gbc_rdbtnActivo);
		
		JButton btnAceptar = new JButton("Aceptar");
		GridBagConstraints gbc_btnAceptar = new GridBagConstraints();
		gbc_btnAceptar.gridx = 2;
		gbc_btnAceptar.gridy = 9;
		gbc_btnAceptar.weightx=2;
		getContentPane().add(btnAceptar, gbc_btnAceptar);
	}

}
