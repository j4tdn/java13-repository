package service;

import java.util.List;

import persistence.DepartmentDto;
import persistence.DepartmentHighestBudgetDto;

public interface DepartmentService {
	List<DepartmentDto> getTotalBudgetIn2020();
	DepartmentHighestBudgetDto getDepartmentHasHighestBudgetIn2020();
}
