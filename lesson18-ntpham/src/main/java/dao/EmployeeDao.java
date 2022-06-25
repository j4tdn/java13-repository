package dao;

import java.util.List;
import java.util.Optional;

import persistence.Employee;

public interface EmployeeDao {
	Optional<Employee> get(String dept_id);
	
	List<Employee> get();
}
