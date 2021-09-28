package ex04;

import java.time.LocalDate;

public class Director extends Personnel{
	private double jobCoefficients;
	
	public Director() {
	}

	public Director(String fullName, LocalDate birthDay, double coefficientsSalary, double jobCoefficients) {
		super(fullName, birthDay, coefficientsSalary);
		this.jobCoefficients = jobCoefficients;
	}

	public double getJobCoefficients() {
		return jobCoefficients;
	}

	public void setJobCoefficients(float jobCoefficients) {
		this.jobCoefficients = jobCoefficients;
	}
	
	
	
	@Override
	public String toString() {
		return super.toString() + ", jobCoefficients: " + jobCoefficients + ", Salary:" + getSalary();
	}

	@Override
	public double getSalary() {
		return (coefficientsSalary + jobCoefficients) * 1250000;
	}
	
	
	
}
