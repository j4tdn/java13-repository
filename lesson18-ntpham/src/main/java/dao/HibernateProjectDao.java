package dao;

import java.util.List;

import persistence.Project;

public class HibernateProjectDao extends AbstractHibernateDao implements ProjectDao {
	private static final String Q_GET_PROJECTS_HAS_BUDGET_BIGGER_THAN_400 = 
			"SELECT pr FROM project pr \n"
			+ "WHERE pr.budget > 400";
	@Override
	public List<Project> getProjectsHasBudgetBiggerThan400() {
		return openSession()
				.createQuery(Q_GET_PROJECTS_HAS_BUDGET_BIGGER_THAN_400, Project.class)
				.getResultList();
	}
}
