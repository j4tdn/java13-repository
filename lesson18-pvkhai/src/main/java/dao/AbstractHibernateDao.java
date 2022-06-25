package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.HibernateProvider;

public class AbstractHibernateDao {
	static SessionFactory sessionFactory;
	
	static {
		sessionFactory = HibernateProvider.getSessionFactory();
	}
	
	Session openSession() {
		return sessionFactory.openSession();
	}
	
	Session getCurrentSession() {
		return sessionFactory.getCurrentSession();
	}
	
}
