package ex04;

import java.time.LocalDate;

public class Staff extends Personnel{
	private String nameOfWorkUnit;
	
	public Staff() {
	}

	public Staff(String fullName, LocalDate birthDay, double coefficientsSalary, String nameOfWorkUnit) {
		super(fullName, birthDay, coefficientsSalary);
		this.nameOfWorkUnit = nameOfWorkUnit;
	}

	public String getNameOfWorkUnit() {
		return nameOfWorkUnit;
	}

	public void setNameOfWorkUnit(String nameOfWorkUnit) {
		this.nameOfWorkUnit = nameOfWorkUnit;
	}

	@Override
	public String toString() {
		return super.toString() + ", nameOfWorkUnit: " + nameOfWorkUnit + ", Salary:" + getSalary();
	}
	
	@Override
	public double getSalary() {
		return coefficientsSalary * 3000000;
	}
}
