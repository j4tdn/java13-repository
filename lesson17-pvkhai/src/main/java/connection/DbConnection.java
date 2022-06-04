package connection;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {
	
	private static Connection conn = null;
	
	public static Connection getConnection() {
		if(conn == null) {
			try {
				Properties props = DbProvider.getProps();
				
				Class.forName(props.getProperty("DRIVER"));
				
				conn = DriverManager.getConnection(props.getProperty("URL"), props.getProperty("USER"), props.getProperty("PASS"));
			} catch (ClassNotFoundException | SQLException | IOException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	
	public static void main(String[] args) {
		System.out.println(getConnection());
	}
}
