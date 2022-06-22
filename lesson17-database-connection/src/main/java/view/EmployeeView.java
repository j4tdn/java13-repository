package view;

import java.util.Optional;

import persistence.Employee;
import service.EmployeeService;
import service.EmployeeServiceImpl;

public class EmployeeView {
	
	private static EmployeeService employeeService;
	
	static {
		employeeService = new EmployeeServiceImpl();
	}
	
	public static void main(String[] args) {
		String email = "com7.default.tp@gmail.com";
		String password = "hellocom7";
		
		System.out.println("isSuccess: " + employeeService.signup(email, password));
		
		System.out.println("=======================");
		
		Optional<Employee> empOpt = Optional.ofNullable(employeeService.signin(email, password));
		if (empOpt.isPresent()) {
			System.out.println("Welcome to control panel");
			System.out.println(empOpt.get());
		} else {
			System.out.println("Wrong username or password");
		}
		
	}
}
