package ex04;

import java.util.Scanner;

public class Employee extends Member{
	public static int basicPay = 1250000;
	
	private String department;
	
	public Employee() {
		super();
	}

	public Employee(String department) {
		super();
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public double pay() {
		return coefficientsSalary * basicPay;
	}
	
	@Override
	public void enterInfo() {
		System.out.print("\n-----Nhân viên-----.\n");
		super.enterInfo();
		System.out.println("Nhập phòng ban: ");
		this.department = new Scanner(System.in).nextLine();
	}
	
	@Override
	public String toString() {
		return super.toString() + "   Nhân viên";
	}
	
}
