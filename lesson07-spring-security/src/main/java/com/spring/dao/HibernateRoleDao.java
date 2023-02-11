package com.spring.dao;

import com.spring.entity.Role;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateRoleDao implements RoleDao{
    @Autowired
    private SessionFactory sessionFactory;

    private static final String Q_FIND_ROLE_BY_ROLE_NAME = "SELECT role FROM Role role WHERE role.name = :name";

    @Override
    public Role findByRoleName(String roleName) {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery(Q_FIND_ROLE_BY_ROLE_NAME, Role.class)
                .setParameter("name", roleName)
                .getSingleResult();
    }
}
