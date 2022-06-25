package service;

import java.util.List;

import persistence.Department;
import persistence.DepartmentBudgetDto;
import persistence.DepartmentDetailBuget;

public interface DepartmentService {
	List<Department> getAll();
	
	public List<DepartmentBudgetDto> getDeparmentProjectHaveBugetMoreThan(int buget);
	
	public List<DepartmentDetailBuget> getTotalOfBugetEachDepartment();
	
	public DepartmentBudgetDto getDepartmentProjectHaveHighestBuget();
}
