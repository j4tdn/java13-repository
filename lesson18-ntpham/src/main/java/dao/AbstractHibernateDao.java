package dao;

import org.hibernate.Cache;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import connection.HibenateProvider;

public class AbstractHibernateDao {
	// Application = SessionFactory
	private static SessionFactory sessionFactory;
	
	static {
		sessionFactory = HibenateProvider.getSessionFactory();
	}
	
	Session openSession() {
		// Option 1: Using openSession >> thread
		// 			 Always create new thread, new sessions while calling openSession
		return sessionFactory.openSession();
	}
	
	Session getCurrentSession() {
		// Option 2: Using getCurrentSession >> thread
		//		   : Only create ONE unique thread, session for each Session Factory
		//		   : session_current_context_class --> singleton pattern
		return sessionFactory.getCurrentSession();
	}
	
	Cache getRegCache() {
		// 2nd cache
		return sessionFactory.getCache();
	}
	
	void clearRegCache(Class<?> clazz) {
		Cache cache = getRegCache();
		if (cache != null) {
			cache.evict(clazz);
		}
	}
	
	void clearAllRegCache(Class<?> clazz) {
		Cache cache = getRegCache();
		if (cache != null) {
			cache.evictAllRegions();
		}
	}
}
