package view;

import java.util.Optional;

import persistence.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class Ex01 {
	
	private static EmployeeService employeeService;
	
	static {
		employeeService = new EmployeeServiceImpl();
	}
	
	public static void main(String[] args) {
		// 1. List all employees by department_id
		System.out.println("1. List all employees by department_id");
		String dept_id = "mgm-dn";
		
		Optional<Employee> employeeOpt = employeeService.get(dept_id);
		employeeOpt.ifPresent(System.out::println);
	}
}
