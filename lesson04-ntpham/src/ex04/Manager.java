package ex04;

import java.time.LocalDate;

public class Manager extends Personnel{
	private int numberOfStaff;
	
	public Manager() {
	}

	public Manager(String fullName, LocalDate birthDay, double coefficientsSalary, int numberOfStaff) {
		super(fullName, birthDay, coefficientsSalary);
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
		return super.toString() + ", numberOfStaff: " + numberOfStaff + ", Salary:" + getSalary();
	}
	
	@Override
	public double getSalary() {
		return coefficientsSalary * 2200000;
	}
	
	
}
