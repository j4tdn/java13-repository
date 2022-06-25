package service;

import java.util.List;

import dao.DepartmentProjectDTODao;
import persistences.DepartmentProjectDTO;

public interface DepartmentProjectDTOService {
	List<DepartmentProjectDTO> getProjectGreaterThan400();
}
