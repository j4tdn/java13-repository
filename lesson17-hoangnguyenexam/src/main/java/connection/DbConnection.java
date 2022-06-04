package connection;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DbConnection {
	private static Connection conn = null;
	private static String url = "jdbc:mysql://localhost:3306/java13_shopping";
	private static String user = "root";
	private static String password = "";
	
	public static Connection getConnection() {
		if(conn == null) {
			
			try {
				Properties props = DbProvider.getProps();
				
				// driver
				Class.forName(props.getProperty("DRIVER")); // Driver.class.getName()
				
				// database information
				conn = DriverManager.getConnection(props.getProperty("URL"),
												   props.getProperty("USER"),
												   props.getProperty("PASSWORD"));
				
			} catch (ClassNotFoundException | SQLException | IOException e) {
				e.printStackTrace();
			}
			
		}
		
		return conn;
	}
}
