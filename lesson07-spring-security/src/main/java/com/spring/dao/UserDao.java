package com.spring.dao;

import com.spring.entity.User;


public interface UserDao {
    void save(User user);

    User findUserByUserName(String userName);
}
