package view;

import java.util.List;

import persistences.DepartmentProjectDTO;
import service.DepartmentProjectDTOService;
import service.DepartmentProjectServoceImpl;

public class ViewProject {
private static DepartmentProjectDTOService departmentProjectDTOService;
	
	static {
		departmentProjectDTOService = new DepartmentProjectServoceImpl();
	}
	
	public static void main(String[] args) {
		System.out.println("=== 3. List all projects of departments which have budget greater than 400 main days");
		List<DepartmentProjectDTO> departmentProjectDTOs = departmentProjectDTOService.getProjectGreaterThan400();
		departmentProjectDTOs.forEach(System.out::println);
		
		System.out.println("=== 4. List total of budget of each department in 2020");
		List<DepartmentProjectDTO> dtos = departmentProjectDTOService.getTotalBudget();
		dtos.forEach(System.out::println);
		
		System.out.println("=== 5. Get department which has project with highest budget in 2020");
		List<DepartmentProjectDTO> departmentProjectDTOs2 = departmentProjectDTOService.getProjectHighestBudget(2021);
		departmentProjectDTOs2.forEach(System.out::println);
	}
}	
