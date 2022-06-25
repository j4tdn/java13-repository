package service;

import java.util.List;

import persistence.Employee;
import persistence.EmployeeDto;

public interface EmployeeService {
	List<Employee> getAll();
	List<Employee> get(String dept_id);
	public List<EmployeeDto> getEmployeeOrderByDepId();
}
