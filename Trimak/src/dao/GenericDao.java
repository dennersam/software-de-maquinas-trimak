  package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDao {
	
	private Connection c;
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		String hostName = "173.173.20.45";
		String dbName = "CorporeRM21102020";
		String user = "rm";
		String senha = "rm";

		Connection c = DriverManager.getConnection(
				String.format("jdbc:sqlserver://%s;databaseName=%s;user=%s;password=%s;", hostName, dbName, user, senha));
		System.out.println("Conexão bem sucedida!");
		
		return c;
	}
}
