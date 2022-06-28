package view;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import persistence.DepartmentDto;
import persistence.Employees;
import persistence.Project;
import service.DepartmentService;
import service.DepartmentServiceImpl;
import service.EmpServiceImpl;
import service.EmployeeService;
import service.ProjectService;
import service.ProjectServiceImpl;

public class App {

	private static String deptId;
	private static int budget;
	private static int year;

	private static ProjectService projectService;
	private static EmployeeService employeeService;
	private static DepartmentService deptService;

	static {
		deptId = "mgm-dn";
		budget = 400;
		year = 2022;
		employeeService = new EmpServiceImpl();
		projectService = new ProjectServiceImpl();
		deptService = new DepartmentServiceImpl();
	}

	public static void main(String[] args) {
		// Câu 1
		System.out.println("\n///======================="+" List all employees by department_id"+"======================///\n");
		List<Employees> employees = employeeService.getEmloyeeById(deptId);
		print(employees);

		// Câu 2
		System.out.println("\n///======================="+"List all employees of each department and sorting dept_id asc"+"======================///\n");
		List<Employees> Oremployees = employeeService.getAllEmp();
		print(Oremployees);

		// Câu 3
		System.out.println("\n///======================="+"List all project have budget > 400"+"======================///\n");
		List<Project> projects = projectService.getAllProject(budget);
		print(projects);

		// Câu 4
		System.out.println("\n///======================="+"List total budget of each department in 2020"+"======================///\n");
		List<DepartmentDto> departList = deptService.getDeptBudget(year);
		print(departList);

		// Câu 5
		System.out.println("\n///======================="+"department which has project with highest budget in 2020"+"======================///\n");
		DepartmentDto departHighestBudg = deptService.getDeptHighestBudget(year);
		print("Department Highest Budget ", departHighestBudg);

	}

	public static <Element> void print(List<Element> elements) {
		for (Element element : elements) {
			System.out.println(element);
		}
	}

	public static <Element> void print(String prefix, Element element) {
		System.out.println(prefix + " >>> " + element);
	}

}
