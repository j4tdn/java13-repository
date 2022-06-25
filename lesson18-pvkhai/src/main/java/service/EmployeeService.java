package service;

import java.util.List;

import persistences.Employee;

public interface EmployeeService {
	List<Employee> getAllEmployeeByDepartment(String dept_id);
	List<Employee> getAllEmployee();
}
