package dao;

import java.util.List;

import persistence.DepartmentDto;
import persistence.DepartmentHighestBudgetDto;

public interface DepartmentDao {
	List<DepartmentDto> getTotalBudgetIn2020();
	DepartmentHighestBudgetDto getDepartmentHasHighestBudgetIn2020();
}
