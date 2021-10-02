package ex04;

import java.util.Scanner;

public class Chief extends HumanResource {
	Integer numberOfStaff;
	
	@Override
	void enterHumanResourceInfo() {
		System.out.println("Please enter below information for Chief: ");
		enterHumanResourceBasicInfo();
		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter Number of staff: ");
		numberOfStaff = Integer.parseInt(ip.nextLine());
	}
	
	@Override
	double salaryCalc() {
		salary = salaryFactor * 2200000;
		return salary;
	}

	@Override
	public String toString() {
		return "Chief    [Name: " + String.format("%-20s", name) + ", Date of Birth: " + String.format("%-10s", dateOfBirth)
				+ ", Salary Factor: " + String.format("%-5s", salaryFactor) + ", Number of Staff: " + String.format("%-5s", numberOfStaff) + ", Salary: " + String.format("%-12s", salaryCalc()) +"]";
	}
}
