package com.persistence.view;

import com.persistence.connection.HibernateProvider;

public class DemoApp {
    public static void main(String[] args) {
        System.out.println(HibernateProvider.getSessionFactory());

//        System.out.println("Option 1: Open session");
//        AbstractHibernateDao abstractHibernateDao = new AbstractHibernateDao();
//        Session s1 = abstractHibernateDao.openSession();
//        Session s2 = abstractHibernateDao.openSession();
//        System.out.println("S1: " + s1);
//        System.out.println("S2: " + s2);
//        System.out.println("S1 == S2: " + (s1 == s2));
//
//
//        System.out.println("Option 2: Get current session");
//        Session s3 = abstractHibernateDao.getCurrentSession();
//        Session s4 = abstractHibernateDao.getCurrentSession();
//        System.out.println("S3: " + s3);
//        System.out.println("S4: " + s4);
//        System.out.println("S3 == S4: " + (s3 == s4));


    }
}
