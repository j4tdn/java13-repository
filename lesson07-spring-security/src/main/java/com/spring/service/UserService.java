package com.spring.service;

import com.spring.entity.User;
import com.spring.model.UserModel;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;


public interface UserService extends UserDetailsService {

    void save(UserModel user);

    User findUserByUserName(String userName);
}
