package test;

import java.sql.ResultSet;
import java.sql.Statement;

import connection.DBConnection;

public class OperacionesDB {

	public static void main(String[] args) {
		actualizarLibro(1, "Los vagos");
		
	}
	public static void actualizarLibro(int id, String genero) {
		DBConnection con = new DBConnection();
		String sql = "UPDATE libros SET genero = '"+genero+ "' where id =" +id;
		
		try {
			Statement st = con.getConnection().createStatement();
			st.executeQuery(sql);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		finally {
			con.desconectar();
		}
	}

}



