package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;

public class DAO {

	Connection conn;
	PreparedStatement stmt;
	ResultSet rs;
	
	
	public void abrirConexao()throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/aula2","root","");
		
	}
	public void close()throws Exception {
		conn.close();
	}
	public static void main(String[] args) {
		try {
			DAO d = new DAO();
			d.abrirConexao();
			d.close();
			System.out.println("conectei..");
		
		} catch (Exception e){
			e.printStackTrace();
			System.out.println("Deu Ruim...");
			
		}
	}
}
