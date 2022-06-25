package view;

import java.util.List;

import persistence.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class Ex02 {
	
	private static EmployeeService employeeService;
	
	static {
		employeeService = new EmployeeServiceImpl();
	}
	
	public static void main(String[] args) {
		// 2. List all employees of each department, sorting by dept_id ascending
		System.out.println("2. List all employees of each department, sorting by dept_id ascending");
		
		List<Employee> employeeOfEachDept = employeeService.get();
		employeeOfEachDept.forEach(System.out::println);
	}
}
