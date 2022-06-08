package com.persistence.service;

import com.persistence.dao.EmployeeDao;
import com.persistence.dao.JdbcEmployeeDao;
import com.persistence.persistence.Employee;

import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private static EmployeeDao employeeDao;

    public EmployeeServiceImpl() {
        employeeDao = new JdbcEmployeeDao();
    }

    @Override
    public List<Employee> getAll() {
        return employeeDao.getAll();
    }

    @Override
    public boolean signup(String email, String password) {
        if (employeeDao.isExist(email)) {
            System.out.println("Email is existed...!");
            return false;
        }
        return employeeDao.signup(email, password);
    }

    @Override
    public Employee signin(String email, String password) {
        return employeeDao.signin(email, password);
    }


}
