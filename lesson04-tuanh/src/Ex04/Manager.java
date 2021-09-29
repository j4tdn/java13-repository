package Ex04;

import java.util.Scanner;

public class Manager extends HRManagement{
	private int numberManagement;
	
	public Manager() {
		
	}

	public Manager(int numberManagement) {
		this.numberManagement = numberManagement;
	}

	public int getNumberManagement() {
		return numberManagement;
	}

	public void setNumberManagement(int numberManagement) {
		this.numberManagement = numberManagement;
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
		System.out.print("Số lượng nhân viên quản lý: ");
		setNumberManagement(ip.nextInt());
	}
	
	@Override
	public double sumSalary() {
		return (getSalary())*2200000;
	}
	@Override
	public void Output() {
		System.out.printf(("Họ và Tên: " + this.getFullname() + ", Ngày sinh:" + this.getDatebirth()+ 
				", Hệ số lương: "+ this.getSalary() + ", Số lượng nhân viên quản lý: " + this.getNumberManagement()
				+ ", Tiền Lương: " +  this.sumSalary()));
		System.out.println();
	}
}
