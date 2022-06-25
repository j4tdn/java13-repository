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
	}
}	
