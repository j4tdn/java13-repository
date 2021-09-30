package ex04;

import java.time.LocalDate;

public class Manager extends Company {
	private int numberOfStaff;
	
	public Manager() {
	}

	public Manager(String fullName, LocalDate dateOfBirth, double coefficientsSalary, int numberOfStaff) {
		super(fullName, dateOfBirth, coefficientsSalary);
		this.numberOfStaff = numberOfStaff;
	}

	public int getNumberOfStaff() {
		return numberOfStaff;
	}

	public void setNumberOfStaff(int numberOfStaff) {
		this.numberOfStaff = numberOfStaff;
	}
	
	@Override
	public String toString() {
		return "Manager: " + super.toString() + ", numberOfStaff: " + numberOfStaff + ", Salary: " + salary();
	}
	
	@Override
	public double salary() {
		return getCoefficientsSalary() * 2200000;
	}
}
