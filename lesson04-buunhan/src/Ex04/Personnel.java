package Ex04;

import java.time.LocalDate;

public abstract class Personnel {

	protected String name;
	protected LocalDate birthday;
	protected double coefficientsSalary;

	public Personnel() {
	}

	public Personnel(String name, LocalDate birthday, double coefficientsSalary) {
		this.name = name;
		this.birthday = birthday;
		this.coefficientsSalary = coefficientsSalary;
	}


	@Override
	public String toString() {
		return name + ", " + birthday.toString() + ", " + coefficientsSalary;
	}
	
	public abstract double getSalary();
}
