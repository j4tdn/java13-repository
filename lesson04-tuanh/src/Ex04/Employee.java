package Ex04;

import java.util.Scanner;

public class Employee extends HRManagement{
	private String department;
	
	public Employee() {
		
	}

	public Employee(String department) {
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
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
		ip.nextLine();
		System.out.print("Tên đơn vị (phòng/ban): ");
		setDepartment(ip.nextLine());
	}
	
	@Override
	public double sumSalary() {
		return getSalary()*1250000;
	}
	@Override
	public void Output() {
		System.out.printf("Họ và Tên: " + this.getFullname() + ", Ngày sinh:" + this.getDatebirth()+ 
				", Hệ số lương: "+ this.getSalary() + ", Tên đơn vị: " + this.getDepartment()
				+ ", Tiền Lương: " +  this.sumSalary());
		System.out.println();
	}
}
