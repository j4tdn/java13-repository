package view;

import java.util.List;

import persistence.DepartmentDto;
import service.DepartmentService;
import service.DepartmentServiceImpl;

public class Ex04 {
private static DepartmentService departmentService;
	
	static {
		departmentService = new DepartmentServiceImpl();
	}
	
	public static void main(String[] args) {
		// 4. List total of budget of each department in 2020
		System.out.println("3. List total of budget of each department in 2020");
		
		List<DepartmentDto> departments = departmentService.getTotalBudgetIn2020();
		departments.forEach(System.out::println);
	}
}
