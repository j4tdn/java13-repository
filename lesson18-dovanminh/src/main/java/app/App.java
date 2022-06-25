package app;

import persistence.Department;
import service.DepartmentService;
import service.EmployeeService;
import service.ProjectService;

public class App {
	private static EmployeeService employeeService = new EmployeeService();
	private static ProjectService projectService = new ProjectService();
	private static DepartmentService departmentService = new DepartmentService();
	public static void main(String[] args) {
//		1
		System.out.println("==========1=========");
		employeeService.getEmployeesByDeptId("mgm-dn").forEach(e -> System.out.println(e));
//		2
		System.out.println("==========2=========");
		employeeService.getEmployeesSortByDeptId().forEach(e -> System.out.println(e));
//		3
		System.out.println("==========3=========");
		projectService.getProjectsByBudget(400).forEach(e -> System.out.println(e));
//		4
		System.out.println("==========4=========");
		departmentService.getBudgetOfDepartments().forEach(e -> System.out.println(e));
//		5
		System.out.println("==========5=========");
		departmentService.getBudgetOfDepartmentsByMaxBudgetAndYear(2021).forEach(e -> System.out.println(e));
//		6
		System.out.println("==========6=========");
		departmentService.save(new Department("mgm-m", "mgm-minh"));
	}
}
