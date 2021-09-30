package ex04;

import java.util.Scanner;

public class Manager extends Member{
	public static int basicPay = 2200000;
	
	private int numberOfManagementStaff;
	
	public Manager() {
		super();
	}

	public Manager(int numberOfManagementStaff) {
		super();
		this.numberOfManagementStaff = numberOfManagementStaff;
	}

	public int getNumberOfManagementStaff() {
		return numberOfManagementStaff;
	}

	public void setNumberOfManagementStaff(int numberOfManagementStaff) {
		this.numberOfManagementStaff = numberOfManagementStaff;
	}

	@Override
	public double pay() {
		return coefficientsSalary * basicPay;
	}
	
	@Override
	public void enterInfo() {
		System.out.print("\n-----Trưởng phòng-----.\n");
		super.enterInfo();
		System.out.println("Nhập số lượng nhân viên quản lí: ");
		this.numberOfManagementStaff = new Scanner(System.in).nextInt();
	}
	
	@Override
	public String toString() {
		return super.toString() + "   Trưởng phòng";
	}
}
