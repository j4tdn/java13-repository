package service;

import java.util.List;
import java.util.Optional;

import dao.EmployeeDao;
import dao.HibernateEmployeeDao;
import persistence.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
		employeeDao = new HibernateEmployeeDao();
	}
	
	public Optional<Employee> get(String dept_id) {
		return employeeDao.get(dept_id);
	}

	@Override
	public List<Employee> get() {
		return employeeDao.get();
	}
}
