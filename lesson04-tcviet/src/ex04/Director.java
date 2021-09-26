package ex04;

import java.time.LocalDate;

public class Director extends Personnel {
	private double jobCoefficient;

	public Director() {
	}

	public Director(String name, LocalDate birthday, double coefficientsSalary, double jobCoefficient) {
		super(name, birthday, coefficientsSalary);
		this.jobCoefficient = jobCoefficient;
	}

	public double getJobCoefficient() {
		return jobCoefficient;
	}

	public void setJobCoefficient(double jobCoefficient) {
		this.jobCoefficient = jobCoefficient;
	}

	@Override
	public String toString() {
		return super.toString() + ", " + jobCoefficient + ", " + getSalary();
	}

	@Override
	public double getSalary() {
		return (coefficientsSalary + jobCoefficient) * 3000000;
	}

}
