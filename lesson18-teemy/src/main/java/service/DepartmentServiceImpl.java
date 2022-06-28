package service;

import java.util.List;

import dao.DepartmentDao;
import dao.HibernateDepartmentDao;
import persistence.Department;
import persistence.DepartmentBudgetDto;
import persistence.DepartmentDetailBuget;

public class DepartmentServiceImpl implements departmentService{

	private static DepartmentDao departmentDao;

	public DepartmentServiceImpl() {
		departmentDao = new HibernateDepartmentDao();
	}

	public List<Department> getAll() {
		return departmentDao.getAll();
	}

	public List<DepartmentBudgetDto> getDeparmentProjectHaveBugetMoreThan(int buget) {
		return departmentDao.getDeparmentProjectHaveBugetMoreThan(buget);
	}

	public List<DepartmentDetailBuget> getTotalOfBugetEachDepartment() {
		return departmentDao.getTotalOfBugetEachDepartment();
	}

	public DepartmentBudgetDto getDepartmentProjectHaveHighestBuget() {
		return departmentDao.getDepartmentProjectHaveHighestBuget();
	}

}