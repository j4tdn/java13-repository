package Ex04;

import java.util.Scanner;

public class HRManagement {
	private String fullname;
	private int datebirth;
	private double salary;
	
	public HRManagement() {
		
	}
	
	public HRManagement(String fullname, int datebirth, double salary) {
		this.fullname = fullname;
		this.datebirth = datebirth;
		this.salary = salary;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getDatebirth() {
		return datebirth;
	}

	public void setDatebirth(int datebirth) {
		this.datebirth = datebirth;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Information : fullname = " + fullname + ", datebirth = " + datebirth + ", salary = " + salary;
	}
	
	public void Input() {
	}
	
	public double sumSalary() {
		return getSalary();
	}
	
	public void Output() {
	}
	
}
