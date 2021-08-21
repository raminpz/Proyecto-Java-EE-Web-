package connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	static String bd = "libreria_udemy";
	static String port = "3306";
	static String login = "root";
	static String password = "admin";
	//jdbc:mysql/ip:puerto/bd
	static String url = "jdbc:mysql://localhost:" + port + "/" + bd; 

	Connection connection = null;
	
	public DBConnection() {
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			connection = DriverManager.getConnection(url,login,password);
			
			if (connection == null) {
				System.out.println("La conexion a base de datos "+ bd + " ha fallado" );
				
			}else {
				System.out.println("La conexion a base de datos " +bd+ " ha sido exitosa");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	//Metodo para conectar a la bd
	public Connection getConnection() {
		return connection;
	
	}
	//Metodo para desconectar a la bd
	public void desconectar() {
		connection = null;
	}
	
}
