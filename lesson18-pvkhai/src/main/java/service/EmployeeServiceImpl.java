package service;

import java.util.List;

import dao.EmployeeDao;
import dao.HibernateEmployeeImpl;
import persistences.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDao employeeDao;
	
	public EmployeeServiceImpl() {
		employeeDao = new HibernateEmployeeImpl();
	}
	
	public List<Employee> getAllEmployeeByDepartment(String dept_id) {
		return employeeDao.getAllEmployeeByDepartment(dept_id);
	}
	
	@Override
	public List<Employee> getAllEmployee() {
		return employeeDao.getAllEmployee();
	}
}
