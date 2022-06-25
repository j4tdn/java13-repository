package service;

import java.util.List;

import dao.DepartmentDao;
import dao.HibernateDepartmentDao;
import persistence.DepartmentDto;
import persistence.DepartmentHighestBudgetDto;

public class DepartmentServiceImpl implements DepartmentService{
	
	private DepartmentDao departmentDao;
	
	public DepartmentServiceImpl() {
		departmentDao = new HibernateDepartmentDao();
	}
	
	@Override
	public List<DepartmentDto> getTotalBudgetIn2020() {
		return departmentDao.getTotalBudgetIn2020();
	}
	
	@Override
	public DepartmentHighestBudgetDto getDepartmentHasHighestBudgetIn2020() {
		return departmentDao.getDepartmentHasHighestBudgetIn2020();
	}
}
