package utils;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

public class HibernateUtils {
	private static SessionFactory sessionFactory = null;

	private HibernateUtils() {

	}

	public static SessionFactory getSessionFactoryXml() {
		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			sessionFactory = configuration.configure("hibernate.cfg.xml").buildSessionFactory();
		}
		return sessionFactory;
	}

	public static SessionFactory getSessionFactoryJava() {
		if (sessionFactory == null) {
			Configuration cfg = new Configuration();

			Properties props = new Properties();
			props.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver");
			props.put(Environment.URL, "jdbc:mysql://localhost:3306/lesson18-comma");
			props.put(Environment.USER, "root");
			props.put(Environment.PASS, "minh");
			props.put(Environment.DIALECT, "org.hibernate.dialect.MySQL5Dialect");
			props.put(Environment.SHOW_SQL, "true");
			// props.put(Environment.HBM2DDL_AUTO, "create-drop");
			
			cfg.setProperties(props);
			
			sessionFactory = cfg.buildSessionFactory();
		}
		return sessionFactory;
	}

	public static void main(String[] args) {
		System.out.println(getSessionFactoryXml());
		System.out.println(getSessionFactoryJava());
	}
}
