package view;

import java.util.List;

import persistences.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class ViewEmployee {
	
	private static EmployeeService employeeService;
	
	static {
		employeeService = new EmployeeServiceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("=== 1.List all employees by department_id ===");
		List<Employee> employeeByDeptDN = employeeService.getAllEmployeeByDepartment("mgm-dn");
		employeeByDeptDN.forEach(System.out::println);
		
		System.out.println("=== 2.List all employees of each department, sorting by dept_id ascending ===");
		List<Employee> employees = employeeService.getAllEmployee();
		employees.forEach(System.out::println);
	}
}
