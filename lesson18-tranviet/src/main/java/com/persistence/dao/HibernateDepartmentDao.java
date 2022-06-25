package com.persistence.dao;

import com.persistence.persistence.Department;
import com.persistence.persistence.DepartmentDto;
import com.persistence.persistence.DepartmentProjectDto;
import com.persistence.persistence.Project;

import java.util.List;

public interface HibernateDepartmentDao {
    List<DepartmentProjectDto> projectsOfDepartments(Integer amount);
    List<DepartmentDto> totalOfBudgetInYear(Integer year);

    DepartmentProjectDto getDepartmentHasProjectWithHighestBudget();

    boolean save(Department department);
}
