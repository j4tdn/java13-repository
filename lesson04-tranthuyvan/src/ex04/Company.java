package ex04;

import java.time.LocalDate;

public abstract class Company {
	private String fullName;
	private LocalDate dateOfBirth;
	private double coefficientsSalary;
	
	public Company() {
	}

	public Company(String fullName, LocalDate dateOfBirth, double coefficientsSalary) {
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(double coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}
	
	@Override
	public String toString() {
		return "fullName=" + fullName + ", dayOfBirth=" + dateOfBirth.toString() + ", coefficientsSalary=" + coefficientsSalary;	
	}
	
	public abstract double salary();
}
