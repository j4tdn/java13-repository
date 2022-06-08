package com.persistence.service;

import com.persistence.persistence.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAll();

    boolean signup(String email, String password);

    Employee signin(String email, String password);
}
