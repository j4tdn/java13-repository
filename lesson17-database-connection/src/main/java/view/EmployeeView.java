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
		String email = "com6.default.tp@gmail.com";
		String password = "Quyen123456";
		//System.out.println("isSuccess: " + employeeService.signup(email, password));
		
		Optional<Employee> empOpt = Optional.ofNullable(employeeService.signin(email, password));
		if(empOpt.isPresent()) {
			System.out.println("Welcome to control panel");
			System.out.println(empOpt.get());
			
		} else {
			System.out.println("Wrong username or password");
		}
		
		
//		String encryptedPassword = DigestUtils.md5Hex(inputPassword);
//		System.out.println("encrypted:"+ encryptedPassword);
	}
	
	
}
