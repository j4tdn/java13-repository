package service;

import java.util.List;

import dao.HibernateEmployeeDao;
import persistence.Employee;

public class EmployeeService {
	private static HibernateEmployeeDao employeeDao = new HibernateEmployeeDao();
	public EmployeeService() {
		
	}
	
	public List<Employee> getEmployeesByDeptId(String deptId){
		return employeeDao.getEmployeesByDeptId(deptId);
	}
	
	public List<Employee> getEmployeesSortByDeptId(){
		return employeeDao.getEmployeesSortByDeptId();
	}
}
