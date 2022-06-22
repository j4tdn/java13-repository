package view;


import connection.HibernateProvider;

public class DemoApp {
	public static void main(String[] args) {
		System.out.println("==> " + HibernateProvider.getSessionFactory());

		/*
		AbstractHibernateDao dao = new AbstractHibernateDao();
		
		System.out.println("===== Option 1: OpenSession =====");
		Session s1 = dao.openSession();
		Session s2 = dao.openSession();

		System.out.println("S1: " + s1);
		System.out.println("S2: " + s2);
		System.out.println(s1 == s2);
		
		System.out.println("===== Option 2: GetCurrentSession =====");
		Session s3 = dao.getCurrentSession();
		Session s4 = dao.getCurrentSession();

		System.out.println("S3: " + s3);
		System.out.println("S4: " + s4);
		System.out.println(s3 == s4);
		*/
	}
}
