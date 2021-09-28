package ex04;

import java.time.LocalDate;

public abstract class Personnel {
	protected String fullName;
	protected LocalDate birthDay;
	protected double coefficientsSalary;
	
	public Personnel() {
	}

	public Personnel(String fullName, LocalDate birthDay, double coefficientsSalary) {
		super();
		this.fullName = fullName;
		this.birthDay = birthDay;
		this.coefficientsSalary = coefficientsSalary;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public LocalDate getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(LocalDate birthDay) {
		this.birthDay = birthDay;
	}

	public double getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(float coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}

	@Override
	public String toString() {
		return fullName + ", " + birthDay + ", coefficientsSalary: " + coefficientsSalary;
	}
	
	public abstract double getSalary();
}
