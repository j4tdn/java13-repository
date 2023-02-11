package com.spring.dao;

import com.spring.entity.Role;

import java.util.List;

public interface RoleDao {
    Role findByRoleName(String employee);
}
