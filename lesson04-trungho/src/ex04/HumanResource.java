package ex04;

import java.util.Scanner;

public abstract class HumanResource {
	String name;
	String dateOfBirth;
	double salaryFactor;
	double salary;
	
	void enterHumanResourceBasicInfo() {
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Enter Name: ");
		name = ip.nextLine();
		
		System.out.println("Enter Date of birth: ");
		dateOfBirth = ip.nextLine();
		
		System.out.println("Enter Salary factor: ");
		salaryFactor = Double.parseDouble(ip.nextLine());
	}
	
	abstract void enterHumanResourceInfo();
	
	abstract double salaryCalc();

	@Override
	public String toString() {
		return "HumanResource [name=" + name + ", dateOfBirth=" + dateOfBirth + ", salaryFactor=" + salaryFactor +"]";
	}
}
