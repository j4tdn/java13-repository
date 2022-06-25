package com.persistence.view;

import com.persistence.persistence.Department;
import com.persistence.persistence.DepartmentDto;
import com.persistence.persistence.DepartmentProjectDto;
import com.persistence.service.DepartmentService;
import com.persistence.service.DepartmentServiceImpl;

import java.util.List;

public class DepartmentView {
    private static DepartmentService departmentService;
    static{
        departmentService = new DepartmentServiceImpl();
    }
    public static void main(String[] args) {
        System.out.println("\n==3. List all projects of departments which have budget greater than 400 main days==\n");
        List<DepartmentProjectDto> departmentProjectDtos = departmentService.projectsOfDepartments(400);
        departmentProjectDtos.forEach(System.out::println);



        System.out.println("\n==4. List total of budget of each department in 2020==\n");
        List<DepartmentDto> departmentDtos = departmentService.totalOfBudgetInYear(2020);
        departmentDtos.forEach(System.out::println);


        System.out.println("\n==5. Get department which has project with highest budget in 2020==\n");
        DepartmentProjectDto departmentProjectDto = departmentService.getDepartmentHasProjectWithHighestBudget();
        System.out.println(departmentProjectDto);


        System.out.println("\n==6. Give a snippet method code to add new department in system==\n");
        Department department = new Department("mgm-sg", "mgm-saigon");
        boolean saveSuccessfully = departmentService.save(department);
        System.out.println("is save: " + saveSuccessfully);
    }
}
