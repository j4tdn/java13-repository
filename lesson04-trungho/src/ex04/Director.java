package ex04;

import java.util.Scanner;

public class Director extends HumanResource{
	double positionFactor;

	@Override
	void enterHumanResourceInfo() {
		System.out.println("Please enter below information for Director: ");
		enterHumanResourceBasicInfo();
		
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter Position factor: ");
		positionFactor = Double.parseDouble(ip.nextLine());
	}
	
	@Override
	double salaryCalc() {
		salary = Double.sum(salaryFactor, positionFactor) * 3000000;
		return salary;
	}
	
	@Override
	public String toString() {
		return "Director [Name: " + String.format("%-20s", name) + ", Date of Birth: " + String.format("%-10s", dateOfBirth)
				+ ", Salary Factor: " + String.format("%-5s", salaryFactor) + ", Position Factor: " + String.format("%-5s", positionFactor) + ", Salary: " + String.format("%-12s", salaryCalc()) +"]";
	}
}
