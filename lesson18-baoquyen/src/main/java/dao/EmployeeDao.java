package dao;

import java.util.List;

import persistence.Employee;

public interface EmployeeDao {

	List<Employee> getEmployee(String dept_id);
	List<Employee> getAllEmployeeSortByDept_id();
}
