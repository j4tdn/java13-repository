package service;


import java.util.List;

import dao.HibernateProjectDao;
import dao.ProjectDao;
import persistence.Project;

public class ProjectServiceImpl implements ProjectService{

	private ProjectDao projectDao;

	public ProjectServiceImpl(){
		projectDao = new HibernateProjectDao();

	}
	public List<Project> getAllProject(int budget) {
		return projectDao.getAllProject(budget);
	}


}