package ex04;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Member{
	protected String fullName;
	protected Date dateOfBirth;
	protected double coefficientsSalary;
	
	
	public Member() {
	}

	public Member(String fullName, Date dateOfBirth, double coefficientsSalary) {
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.coefficientsSalary = coefficientsSalary;
	}
	
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(double coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}
	
	public void enterInfo() {
		try {
			Scanner ip = new Scanner(System.in);
	        System.out.println("Nhập họ và tên: ");
	        this.fullName=ip.nextLine();
	      
	        System.out.println("Nhập ngày tháng năm sinh (dd/MM/yyyy): ");
	        SimpleDateFormat dayFormat = new SimpleDateFormat("dd/MM/yyyy");
	        this.dateOfBirth = dayFormat.parse(ip.nextLine());
	        
	        System.out.println("Nhập hệ số lương: ");
	        this.coefficientsSalary = ip.nextDouble();
		} catch (Exception e) {  }
	}
		
	@Override
	public String toString() {
		String birthDate = new SimpleDateFormat("dd/MM/yyyy").format(dateOfBirth);
		//return fullName + " " + birthDate + " " + coefficientsSalary + " " + pay();
		return String.format("%-20s%15s%20.2f%15.2f", fullName, birthDate, coefficientsSalary, pay());
	}
	
	public abstract double pay();
}
