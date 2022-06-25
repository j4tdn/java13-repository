package view;

import java.util.List;

import persistence.Project;
import service.ProjectService;
import service.ProjectServiceImpl;

public class Ex03 {
	
	private static ProjectService projectService;
	
	static {
		projectService = new ProjectServiceImpl();
	}
	
	public static void main(String[] args) {
		// 2. List all employees of each department, sorting by dept_id ascending
		System.out.println("2. List all employees of each department, sorting by dept_id ascending");
		
		List<Project> projects = projectService.getProjectsHasBudgetBiggerThan400();
		projects.forEach(System.out::println);
	}
}
	