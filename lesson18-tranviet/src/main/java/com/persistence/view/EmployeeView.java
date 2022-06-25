package com.persistence.view;

import com.persistence.persistence.Employee;
import com.persistence.service.EmployeeService;
import com.persistence.service.EmployeeServiceImpl;

import java.util.List;

public class EmployeeView {
    private static EmployeeService employeeService;

    static {
        employeeService = new EmployeeServiceImpl();
    }

    public static void main(String[] args) {
        System.out.println("\n1) ===List all employees by department_id===\n");
        List<Employee> employeesOfDepartment = employeeService.employeesOfDepartment("mgm-dn");
        employeesOfDepartment.forEach(System.out::println);


        System.out.println("\n2) ===List all employees of each department, sorting by dept_id ascending===\n");
        List<Employee> employeesOfEachDepartment = employeeService.employeesOfEachDepartment();
        employeesOfEachDepartment.forEach(System.out::println);
    }
}
