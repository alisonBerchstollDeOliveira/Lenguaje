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
