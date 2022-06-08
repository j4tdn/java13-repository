package com.persistence.view;

import com.persistence.persistence.Employee;
import com.persistence.service.EmployeeService;
import com.persistence.service.EmployeeServiceImpl;

public class EmployeeView {
    private static EmployeeService employeeService;

    static {
        employeeService = new EmployeeServiceImpl();
    }

    public static void main(String[] args) {
//        String password = "hello123";
//        String encryptedPassword = DigestUtils.md5Hex(password);
//        System.out.println(encryptedPassword);

//        System.out.println("Get all employees: ");
//        List<Employee> employeeList = employeeService.getAll();
//        employeeList.forEach(System.out::println);

        String email = "com6.default.tp@gmail.com";
        String password = "helloworld6";
//        boolean isSignUpSuccessfully = employeeService.signup(email, password);
//        System.out.println("Sign Up SuccessFully: " + isSignUpSuccessfully);

        Employee employee = employeeService.signin(email, password);
        System.out.println(employee != null ? employee : "Wrong username or password...!!!");

    }
}
