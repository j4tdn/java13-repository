package com.persistence.service;

import com.persistence.persistence.Department;
import com.persistence.persistence.DepartmentDto;
import com.persistence.persistence.DepartmentProjectDto;

import java.util.List;

public interface DepartmentService {
    List<DepartmentProjectDto> projectsOfDepartments(Integer amount);
    List<DepartmentDto> totalOfBudgetInYear(Integer year);
    DepartmentProjectDto getDepartmentHasProjectWithHighestBudget();
    boolean save(Department department);
}
