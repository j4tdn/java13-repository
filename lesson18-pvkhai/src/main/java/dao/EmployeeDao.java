package dao;

import java.util.List;

import persistences.Employee;

public interface EmployeeDao {
	List<Employee> getAllEmployeeByDepartment(String dept_id);
	List<Employee> getAllEmployee();
}
