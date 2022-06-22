package service;

import persistence.Employee;

public interface EmployeeService {
	boolean signup(String email, String password);
	Employee signin(String email, String password);
}
