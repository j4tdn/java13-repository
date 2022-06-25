package service;

import java.util.List;
import java.util.Optional;

import persistence.Employee;

public interface EmployeeService {
	Optional<Employee> get(String dept_id);
	List<Employee> get();
}
