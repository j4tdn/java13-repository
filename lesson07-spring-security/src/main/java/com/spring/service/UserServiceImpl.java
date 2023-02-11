package com.spring.service;

import com.spring.dao.RoleDao;
import com.spring.dao.UserDao;
import com.spring.entity.Role;
import com.spring.entity.User;
import com.spring.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;


@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private RoleDao roleDao;
    @Override
    @Transactional
    public void save(UserModel userModel) {
        // Convert UserModel to UserEntity
        // B1: Encrypt password user BCrypt algorithm
        // B2: Assign default role to user
        User user = new User();
        user.setUsername(userModel.getUserName());
        user.setPassword(passwordEncoder.encode(userModel.getPassword()));
        user.setFirstName(userModel.getFirstName());
        user.setLastName(userModel.getLastName());
        user.setEmail(userModel.getEmail());

        // UI passes a ROLE_NAME
        // Using drop down list on UI for roles
        user.setRoles(Arrays.asList(roleDao.findByRoleName(Role.EMPLOYEE)));


        // Save UserEntity to Table
        userDao.save(user);
    }

    @Override
    @Transactional
    public User findUserByUserName(String userName) {
        return userDao.findUserByUserName(userName);
    }

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        // verify login feature by default, replace JdbcDaoImpl
        System.out.println("\n verify login feature by default, replace JdbcDaoImpl \n");
        User user = userDao.findUserByUserName(username);
        if (user == null) {
            throw new UsernameNotFoundException("Invalid username or password");
        }

        return new org.springframework.security.core.userdetails.User(user.getUsername(),
                user.getPassword(), mapToAuthorities(user.getRoles()));
    }

    private Collection<? extends GrantedAuthority> mapToAuthorities(List<Role> roles) {
        return roles.stream()
                .map(role -> new SimpleGrantedAuthority(role.getName()))
                .collect(Collectors.toList());
    }
}
