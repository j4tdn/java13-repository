package view;

import java.util.List;

import persistence.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class EmployeeView {
	
	private static EmployeeService employeeService;
	
	private static String dept_id;
	
	static {
		employeeService = new EmployeeServiceImpl();
		dept_id = "mgm-dn";
	}
	
	public static void main(String[] args) {
		System.out.println("Bai 1: List all employees by department_id");
		List<Employee> employeeByDeptId = employeeService.getEmployee(dept_id);
		employeeByDeptId.forEach(System.out::println);
		System.out.println("==================================\n");
		
		System.out.println("Bai2: List all employees of each department, sorting by dept_id ascending");
		List<Employee> employeeSortByDeptId = employeeService.getAllEmployeeSortByDept_id();
		employeeSortByDeptId.forEach(System.out::println);
		System.out.println("==================================\n");
		
		
	}
}
