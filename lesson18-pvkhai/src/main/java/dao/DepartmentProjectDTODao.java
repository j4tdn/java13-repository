package dao;

import java.util.List;

import persistences.DepartmentProjectDTO;

public interface DepartmentProjectDTODao {
	List<DepartmentProjectDTO> getProjectGreaterThan400();
}
