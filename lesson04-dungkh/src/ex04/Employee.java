package ex04;

import java.util.Scanner;

public class Employee extends Company {
	 private String nameDepartment;
	
	 
	 public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(String fullName, String dateOfBirth, float coefficientsSalary,String nameDepartment) {
		super(fullName, dateOfBirth, coefficientsSalary);
		this.nameDepartment = nameDepartment;
	}

	public String getNameDepartment() {
		return nameDepartment;
	}

	public void setNameDepartment(String nameDepartment) {
		this.nameDepartment = nameDepartment;
	}
	@Override
	public long salary() {
		return (long) (this.getCoefficientsSalary()*1250000);
	}

	@Override
	public String toString() {
		return "Employee [FullName()=" + getFullName() + ", DateOfBirth()=" + getDateOfBirth()
				+ ", CoefficientsSalary()=" + getCoefficientsSalary() + ", Department=" + nameDepartment
				+ ", salary()=" + salary() + "]";
	}
}
