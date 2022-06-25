package com.persistence.service;

import com.persistence.persistence.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> employeesOfDepartment(String dept_id);
    List<Employee> employeesOfEachDepartment();
}
