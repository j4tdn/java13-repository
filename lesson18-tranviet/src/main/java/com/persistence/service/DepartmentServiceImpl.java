package com.persistence.service;

import com.persistence.dao.HibernateDepartmentDao;
import com.persistence.dao.HibernateDepartmentDaoImpl;
import com.persistence.persistence.Department;
import com.persistence.persistence.DepartmentDto;
import com.persistence.persistence.DepartmentProjectDto;

import java.util.List;

public class DepartmentServiceImpl implements DepartmentService{
    private HibernateDepartmentDao hibernateDepartmentDao;
    public DepartmentServiceImpl(){
        hibernateDepartmentDao = new HibernateDepartmentDaoImpl();
    }
    @Override
    public List<DepartmentProjectDto> projectsOfDepartments(Integer amount) {
        return hibernateDepartmentDao.projectsOfDepartments(amount);
    }

    @Override
    public List<DepartmentDto> totalOfBudgetInYear(Integer year) {
        return hibernateDepartmentDao.totalOfBudgetInYear(year);
    }

    @Override
    public DepartmentProjectDto getDepartmentHasProjectWithHighestBudget() {
        return hibernateDepartmentDao.getDepartmentHasProjectWithHighestBudget();
    }

    @Override
    public boolean save(Department department) {
        return hibernateDepartmentDao.save(department);
    }
}
