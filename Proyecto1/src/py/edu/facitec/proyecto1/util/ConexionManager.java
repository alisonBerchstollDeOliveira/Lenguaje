package py.edu.facitec.proyecto1.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author Alison Berchstoll de oliveira
 * Sera el encargado de abrir y cerrar una conexion a la base de datos
 */
public class ConexionManager {
	
	private static Connection conexion; //Abre una seccion con la BD.
	public static Statement stm; //ejecuta secuencia sql en la BD.
	
	private static final String URL="jdbc:postgresql://localhost:5432/proyecto1";
	private static final String USER="postgres";
	private static final String PASSWORD="postgres";
	
	public static Connection abrirConexion(){
		
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Conexion con sucesso");
		} catch (ClassNotFoundException e) {
			System.out.println("Conexion con error");
			e.printStackTrace();
		}
		try {
			conexion=DriverManager.getConnection(URL, USER, PASSWORD);
			stm= conexion.createStatement(); //Listo para recibir sentencia sql
			} catch (SQLException e) {
			e.printStackTrace();
		}
		return conexion;
		
	}
	public static void cerrarConexion(){
		if (conexion!=null) {
			try {
				stm.close(); //Cierra la sentencia
				conexion.close(); //Cierra la conexion
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		ConexionManager.abrirConexion();
	}
	
}
