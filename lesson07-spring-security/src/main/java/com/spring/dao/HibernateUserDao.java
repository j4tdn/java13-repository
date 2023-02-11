package com.spring.dao;

import com.spring.entity.User;
import com.spring.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.logging.Logger;

@Repository
public class HibernateUserDao implements UserDao{
    private Logger logger = Logger.getLogger(getClass().getName());
    private static final String Q_FIND_BY_USER_NAME = "SELECT user FROM User user WHERE user.username = :username";

    @Autowired
    private SessionFactory sessionFactory;
    @Override
    public void save(User user) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(user);
    }

    @Override
    public User findUserByUserName(String userName) {
        Session session = sessionFactory.getCurrentSession();
        User user = null;
        try {
            user = session.createQuery(Q_FIND_BY_USER_NAME, User.class)
                    .setParameter("username", userName)
                    .getSingleResult();
        } catch (Exception e) {
            logger.warning("Username already exist");
        }

        return user;
    }
}
