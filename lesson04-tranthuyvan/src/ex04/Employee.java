package ex04;

import java.time.LocalDate;

public class Employee extends Company {
	private String departmentName;
	
	public Employee() {
	}

	public Employee(String fullName, LocalDate dateOfBirth, double coefficientsSalary, String departmentName) {
		super(fullName, dateOfBirth, coefficientsSalary);
		this.departmentName = departmentName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	@Override
	public String toString() {
		return "Employee: " + super.toString() + ", departmentName: " + departmentName + ", Salary: " + salary();
	}
	
	@Override
	public double salary() {
		return getCoefficientsSalary() * 1250000;
	}
}
