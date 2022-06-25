package view;

import java.util.List;

import persistence.DepartmentDto;
import persistence.Project;
import service.DepartmentService;
import service.DepartmentServiceImpl;

public class DepartmentView {
	
	private static DepartmentService departmentService;
	private static int year;
	
	static {
		departmentService = new DepartmentServiceImpl();
		year = 2020;
	}
	
	public static void main(String[] args) {
		System.out.println("Bai 4: List total of budget of each department in 2020");
		List<DepartmentDto> getTotalBubget = departmentService.getDeptTotalBudget(year);
		getTotalBubget.forEach(System.out::println);
		System.out.println("==================================\n");
		
		
		System.out.println("Bai 5: Get department which has project with highest budget in 2020");
		DepartmentDto getDeptHasHighestBudgetProject = departmentService.getDeptHighestBudget(year);
		System.out.println(getDeptHasHighestBudgetProject);
		System.out.println("==================================\n");
		
		
	}
}
