package provider;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import persistence.Department;
import persistence.Employee;


public class HibernateProvider {
	private static final String HIBERNATE_PROPERTIES_PATH = "hibernate.cfg.xml";
	private static SessionFactory sessionFactory;
	
	private HibernateProvider() {
	}
	
	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
			Configuration configuration = new Configuration();
			sessionFactory = configuration.configure(HIBERNATE_PROPERTIES_PATH).buildSessionFactory();
		}
		return sessionFactory;
	}
}