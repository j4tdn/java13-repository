package dao;

import java.util.List;

import persistence.Project;

public class HibernateProjectDao extends AbstractHibernateDao implements ProjectDao {

	private static final String Q_GET_PROJECT_BY_BUDGET = "SELECT* FROM project WHERE budget > :budget";
	@Override
	public List<Project> getProjectByBudgetGreaterThan(double budget) {
		return openSession()
				.createNativeQuery(Q_GET_PROJECT_BY_BUDGET, Project.class)
				.setParameter("budget", budget)
				.getResultList();
	}
}
