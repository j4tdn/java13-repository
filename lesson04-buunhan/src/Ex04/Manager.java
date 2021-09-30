package Ex04;

import java.time.LocalDate;

public class Manager extends Personnel {
	private int numberOfStaffs;

	public Manager() {
	}

	public Manager(String name, LocalDate birthday, double coefficientsSalary, int numberOfStaffs) {
		super(name, birthday, coefficientsSalary);
		this.numberOfStaffs = numberOfStaffs;
	}

	public int getNumberOfStaffs() {
		return numberOfStaffs;
	}

	public void setNumberOfStaffs(int numberOfStaffs) {
		this.numberOfStaffs = numberOfStaffs;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + numberOfStaffs + ", " + getSalary();
	}

	@Override
	public double getSalary() {
		return coefficientsSalary * 2200000;
	}
}
