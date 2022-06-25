package service;

import java.util.List;

import dao.EmployeeDao;
import dao.HibernateEmployeeDao;
import persistence.Employee;

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeDao employeeDao;

	public EmployeeServiceImpl() {
		employeeDao = new HibernateEmployeeDao();
	}

	
	public List<Employee> getEmployee(String dept_id) {
		return employeeDao.getEmployee(dept_id);
	}
	
	@Override
	public List<Employee> getAllEmployeeSortByDept_id() {
		return employeeDao.getAllEmployeeSortByDept_id();
	}
}
