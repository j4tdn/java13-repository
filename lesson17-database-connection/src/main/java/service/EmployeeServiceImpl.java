package service;

import dao.EmloyeeDao;
import dao.JdbcEmployeeDao;
import persistence.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmloyeeDao employeeDao;
	
	public EmployeeServiceImpl() {
		employeeDao = new JdbcEmployeeDao();
	}
	
	@Override
	public boolean signup(String email, String password) {
		if (employeeDao.isExist(email)) {
			System.out.println("Email is existed already ...");
			return false;
		}
		return employeeDao.signup(email, password);
	}
	
	@Override
	public Employee signin(String email, String password) {
		return employeeDao.signin(email, password);
	}
}
