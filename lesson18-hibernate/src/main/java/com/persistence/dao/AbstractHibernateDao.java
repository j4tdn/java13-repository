package com.persistence.dao;

import com.persistence.connection.HibernateProvider;
import org.hibernate.Cache;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class AbstractHibernateDao {
    private static SessionFactory sessionFactory;

    static {
        sessionFactory = HibernateProvider.getSessionFactory();
    }

    Session openSession() {
        // Option 1: Open session
        // Always create new thread, new session when calling
        return sessionFactory.openSession();
    }

    Session getCurrentSession() {
        // Option 2: Get current session
        // Use only one unique thread, session for each Session Factory (Application)
        // Add property <session_current_context_class> (thread) to config.xml
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

    void clearAllRegCache() {
        Cache cache = getRegCache();
        if (cache != null) {
            cache.evictAllRegions();
        }
    }
}
