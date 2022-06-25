package view;

import java.util.List;

import persistence.Project;
import service.ProjectService;
import service.ProjectServiceImpl;

public class ProjectView {
	
	private static ProjectService projectService;
	private static double budget;
	
	static {
		projectService = new ProjectServiceImpl();
		budget = 400;
	}
	public static void main(String[] args) {
		System.out.println("Bai 3: List all projects of departments which have budget greater than 400 main days");
		List<Project> getProjectsHasBudgetGreater400 = projectService.getProjectByBudgetGreaterThan(budget);
		getProjectsHasBudgetGreater400.forEach(System.out::println);
		System.out.println("==================================\n");
	}
}
