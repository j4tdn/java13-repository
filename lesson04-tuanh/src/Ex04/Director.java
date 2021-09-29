package Ex04;

import java.util.Scanner;

public class Director extends HRManagement{
	private double positionId;

	public Director() {
		
	}
	
	public Director(double positionId) {
		this.positionId = positionId;
	}

	public double getPositionId() {
		return positionId;
	}

	public void setPositionId(double positionId) {
		this.positionId = positionId;
	}
	
	@Override
	public void Input() {
		Scanner ip = new Scanner(System.in);
		System.out.print("Họ và Tên: ");
		setFullname(ip.nextLine());
		System.out.print("Ngày sinh: ");
		setDatebirth(ip.nextInt());
		System.out.print("Hệ số lương: ");
		setSalary(ip.nextDouble());
		System.out.print("Hệ số chức vụ: ");
		setPositionId(ip.nextDouble());
	}
	@Override
	public double sumSalary() {
		return (getSalary() + getPositionId())*3000000;
	}
	@Override
	public void Output() {
		System.out.printf("Họ và Tên: " + this.getFullname() + ", Ngày sinh:" + this.getDatebirth()+ 
				", Hệ số lương: "+ this.getSalary() + ", Hệ số chức vụ: " + this.getPositionId()
				+ ", Tiền Lương: " +  this.sumSalary());
		System.out.println();
	}
}
