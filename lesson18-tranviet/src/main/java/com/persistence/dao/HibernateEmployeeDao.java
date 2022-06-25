package com.persistence.dao;

import com.persistence.persistence.Employee;

import java.util.List;
import java.util.Optional;

public interface HibernateEmployeeDao {

    List<Employee> employeesOfDepartment(String dept_id);
    List<Employee> employeesOfEachDepartment();
}
