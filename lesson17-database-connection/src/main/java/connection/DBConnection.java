package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DBConnection {
	
	private static Connection con = null;
//	private static String url = "jdbc:mysql://localhost:3306/java13_shopping";
//	private static String username = "root";
//	private static String password = "Baoquyen07";
	public static Connection getConnecttion() {
		if(con == null) {
			try {
				Properties pros = DBProvider.getProps();
				Class.forName(pros.getProperty("DRIVER"));
				con = DriverManager.getConnection(pros.getProperty("URL"),
						pros.getProperty("USERNAME"),
						pros.getProperty("PASSWORD"));
				System.out.println("connected");
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return con;
	}
	public static void main(String[] args) {
		System.out.println(getConnecttion());
	}
}
