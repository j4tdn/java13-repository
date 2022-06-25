package service;

import java.util.List;

import dao.HibernateProjectDao;
import dao.ProjectDao;
import persistence.Project;

public class ProjectServiceImpl implements ProjectService{
	
	private ProjectDao projectDao;
	
	public ProjectServiceImpl() {
		projectDao = new HibernateProjectDao();
	}
	
	@Override
	public List<Project> getProjectsHasBudgetBiggerThan400() {
		return projectDao.getProjectsHasBudgetBiggerThan400();
	}
}
