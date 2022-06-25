package com.persistence.service;

import com.persistence.dao.HibernateEmployeeDao;
import com.persistence.dao.HibernateEmployeeDaoImpl;
import com.persistence.persistence.Employee;

import java.util.List;
import java.util.Optional;

public class EmployeeServiceImpl implements EmployeeService{
    private HibernateEmployeeDao hibernateEmployeeDao;
    public EmployeeServiceImpl(){
        hibernateEmployeeDao = new HibernateEmployeeDaoImpl();
    }
    @Override
    public List<Employee> employeesOfDepartment(String dept_id) {
        return hibernateEmployeeDao.employeesOfDepartment(dept_id);
    }

    @Override
    public List<Employee> employeesOfEachDepartment() {
        return hibernateEmployeeDao.employeesOfEachDepartment();
    }


}
