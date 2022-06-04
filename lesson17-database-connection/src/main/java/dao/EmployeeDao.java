package dao;

import persistence.Employee;

public interface EmployeeDao {

	boolean signup(String email, String password);
	Employee signin(String email, String password);
}
