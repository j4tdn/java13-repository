package ex04;

import java.time.LocalDate;

public class Director extends Company {
	private double positionCoefficient;
	
	public Director() {
	}

	public Director(String fullName, LocalDate dateOfBirth, double coefficientsSalary, double positionCoefficient) {
		super(fullName, dateOfBirth, coefficientsSalary);
		this.positionCoefficient = positionCoefficient;
	}

	public double getPositionCoefficient() {
		return positionCoefficient;
	}

	public void setPositionCoefficient(double positionCoefficient) {
		this.positionCoefficient = positionCoefficient;
	}
	
	@Override
	public String toString() {
		return "Director: " + super.toString() + ", positionCoefficient: " + positionCoefficient + ", Salary: " + salary();
	}
	
	@Override
	public double salary() {
		return (getCoefficientsSalary() + positionCoefficient) * 3000000;
	}
}
