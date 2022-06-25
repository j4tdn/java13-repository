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
}
