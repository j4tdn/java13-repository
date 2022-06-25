package connection;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibenateProvider {
	private static SessionFactory sessionFactory;
	
	private HibenateProvider() {
		
	}
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			sessionFactory = configuration.configure("hibernate.cfg.xml")
						 				  .buildSessionFactory();
		}
		return sessionFactory;
	}
}
