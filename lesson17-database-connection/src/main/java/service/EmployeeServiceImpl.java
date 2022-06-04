package service;

import dao.EmployeeDao;
import dao.JdbcEmployeeDao;
import persistence.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
		employeeDao = new JdbcEmployeeDao();
	}
	@Override
	public boolean signup(String email, String password) {
		
		return employeeDao.signup(email, password);
		
	}
	
	@Override
	public Employee signin(String email, String password) {
		return employeeDao.signin(email, password);
	}
}
