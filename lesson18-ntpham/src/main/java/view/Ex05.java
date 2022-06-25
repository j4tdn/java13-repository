package view;

import persistence.DepartmentHighestBudgetDto;
import service.DepartmentService;
import service.DepartmentServiceImpl;

public class Ex05 {
	private static DepartmentService departmentService;
	
	static {
		departmentService = new DepartmentServiceImpl();
	}
	
	public static void main(String[] args) {
		// 5. Get department which has project with highest budget in 2020
		System.out.println("5. Get department which has project with highest budget in 2020");
		
		DepartmentHighestBudgetDto department = departmentService.getDepartmentHasHighestBudgetIn2020();
		System.out.println(department);
	}
}
