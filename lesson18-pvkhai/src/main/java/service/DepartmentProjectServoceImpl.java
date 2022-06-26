package service;

import java.util.List;

import dao.DepartmentProjectDTODao;
import dao.HibernateDepartmentProjectDTODaoImpl;
import persistences.DepartmentProjectDTO;

public class DepartmentProjectServoceImpl implements DepartmentProjectDTOService{
	private DepartmentProjectDTODao departmentProjectDTODao;
	
	public DepartmentProjectServoceImpl() {
		departmentProjectDTODao = new HibernateDepartmentProjectDTODaoImpl();
	}
	@Override
	public List<DepartmentProjectDTO> getProjectGreaterThan400() {
		return departmentProjectDTODao.getProjectGreaterThan400();
	}
	@Override
	public List<DepartmentProjectDTO> getProjectHighestBudget(int year) {
		return departmentProjectDTODao.getProjectHighestBudget(year);
	}
	@Override
	public List<DepartmentProjectDTO> getTotalBudget() {
		return departmentProjectDTODao.getTotalBudget();
	}
}
