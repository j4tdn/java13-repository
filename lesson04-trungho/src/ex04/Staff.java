package ex04;

import java.util.Scanner;

public class Staff extends HumanResource{
	String department;
	
	@Override
	void enterHumanResourceInfo() {
		System.out.println("Please enter below information for Staff: ");
		enterHumanResourceBasicInfo();
		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter Department: ");
		department = ip.nextLine();
	}
	
	@Override
	double salaryCalc() {
		salary = salaryFactor * 1250000;
		return salary;
	}

	@Override
	public String toString() {
		return "Staff    [Name: " + String.format("%-20s", name) + ", Date of Birth: " + String.format("%-10s", dateOfBirth) + ", Salary Factor: "
				+ String.format("%-5s", salaryFactor) + ", Department: " + String.format("%-10s", department) + ", Salary: " + String.format("%-12s", salaryCalc()) +"]";
	}
}
