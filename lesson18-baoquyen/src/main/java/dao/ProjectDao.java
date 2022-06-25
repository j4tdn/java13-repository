package dao;

import java.util.List;

import persistence.Project;

public interface ProjectDao {
	List<Project> getProjectByBudgetGreaterThan(double budget);
}
