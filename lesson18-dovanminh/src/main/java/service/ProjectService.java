package service;

import java.util.List;

import dao.HibernateProjectDao;
import persistence.Project;

public class ProjectService {
	private static HibernateProjectDao projectDao = new HibernateProjectDao();
	public List<Project> getProjectsByBudget(double budget){
		return projectDao.getProjectsByBudget(budget);
	}
}
