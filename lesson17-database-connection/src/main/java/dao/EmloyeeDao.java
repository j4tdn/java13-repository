package dao;

import persistence.Employee;

public interface EmloyeeDao {
	
	boolean signup(String email, String password);
	
	Employee signin(String email, String password);

	boolean isExist(String email);
}
