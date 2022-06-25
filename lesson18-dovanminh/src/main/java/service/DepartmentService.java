package service;

import java.util.List;

import dao.HibernateDepartmentDao;
import persistence.Department;
import persistence.DepartmentDto;

public class DepartmentService {
	private static HibernateDepartmentDao departmentDao = new HibernateDepartmentDao();
	public List<DepartmentDto> getBudgetOfDepartments(){
		return departmentDao.getBudgetOfDepartments();
	}
	public List<DepartmentDto> getBudgetOfDepartmentsByMaxBudgetAndYear(int year){
		return departmentDao.getBudgetOfDepartmentsByMaxBudgetAndYear(year);
	}
	public void save(Department department) {
		departmentDao.save(department);
	}
}
