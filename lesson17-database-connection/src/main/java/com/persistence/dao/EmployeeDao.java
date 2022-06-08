package com.persistence.dao;

import com.persistence.persistence.Employee;

import java.util.List;

public interface EmployeeDao {
    List<Employee> getAll();

    boolean signup(String email, String password);

    Employee signin(String email, String password);

    boolean isExist(String email);
}
