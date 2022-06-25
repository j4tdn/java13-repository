package service;

import java.util.List;

import dao.DepartmentDao;
import dao.HibernateDepartmentDao;
import persistence.DepartmentDto;

public class DepartmentServiceImpl implements DepartmentService {
	
	private static DepartmentDao departmentDao;
	
	public DepartmentServiceImpl() {
		departmentDao = new HibernateDepartmentDao();
	}
	
	
	@Override
	public List<DepartmentDto> getDeptTotalBudget(int year) {
		return departmentDao.getDeptTotalBudget(year);
	}
	@Override
	public DepartmentDto getDeptHighestBudget(int year) {
		return departmentDao.getDeptHighestBudget(year);
	}
	
	
}
