package service;

import java.util.List;

import persistence.Employee;

public interface EmployeeService {
	List<Employee> getEmployee(String dept_id);
	List<Employee> getAllEmployeeSortByDept_id();
}
