package dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import persistence.Department;

public class HibernateInsertDepartment extends AbstractHibernateDao {
	private static SessionFactory factory;
	private static ServiceRegistry serviceRegistry;

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure();
		config.addAnnotatedClass(Department.class);
		serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
		factory = config.buildSessionFactory(serviceRegistry);
		HibernateInsertDepartment ins = new HibernateInsertDepartment();
		String kq = ins.insert(new Department("mgm-hu", "mgm-hue vn"));
		System.out.println("insert:" + kq);
	}

	public String insert(Department department) {
		String dept = null;
		Transaction tx;
		Session session = openSession();
		try {
			tx = session.beginTransaction();
			dept = (String) session.save(department);
		} catch (HibernateException e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return dept;
	}
}
