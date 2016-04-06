package py.edu.facitec.proyecto1.dao;

import java.sql.SQLException;

import py.edu.facitec.proyecto1.entidad.Cliente;
import py.edu.facitec.proyecto1.util.ConexionManager;

/**
 * 
 * @author Alison Berchstoll de Oliveira
 * DAp = Data Access Object.
 * Encapsular acceso a la base de datos mediante esta clase para el objeto cliente.
 */
public class ClienteDao {
	
	public static void guardarCliente(Cliente cliente){
		String sql = "insert into tb_cliente(cli_documento, cli_nombre, cli_direccion, cli_telefono,"
				+ " cli_sexo, cli_activo ) values ('"+cliente.getDocumento()+"','"+cliente.getNombre()+"',"
						+ "'"+cliente.getDireccion()+"', '"+cliente.getTelefono()+"',"
								+ ""+cliente.getSexo()+","+cliente.isActivo()+")";
		System.out.println("SQL : "+sql);
		ConexionManager.abrirConexion(); //Abre la conexion con la db.
		
		try {
			ConexionManager.stm.executeUpdate(sql); //Mandamos ejecutar el SQL
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		ConexionManager.cerrarConexion(); //Cerramos la conexion
	}
}
