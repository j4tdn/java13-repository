package dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.NativeQuery;

import persistence.Employee;
import persistence.Project;

public class HibernateProjectDao extends EntityDao {
	public List<Project> getProjectsByBudget(double budget){
		Session session = openSession();
		String query = "SELECT * FROM project WHERE budget > " + budget + " ORDER BY budget";
		NativeQuery<Project> projects = session.createNativeQuery(query, Project.class);
		return projects.getResultList();
	}
}
