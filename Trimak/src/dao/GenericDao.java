  package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GenericDao {
	
	private Connection c;
	
	public Connection getConnection() throws ClassNotFoundException, SQLException {
		String hostName = "localhost";
		String dbName = "test";
		String user = "sa";
		String senha = "Dnr@210986";
		
		c = DriverManager.getConnection(
				String.format("jdbc:sqlserver://%s:1433;databaseName=%s;user=%s;password=%s;", hostName, dbName, user, senha));
		return c;
		
	}
}
