package ex04;

import java.time.LocalDate;

public class Manager extends Parent{
	private int NumberOfEmployees;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	

	public Manager(String name, LocalDate date, float coefficientSalary, int numberOfEmployees) {
		super(name, date, coefficientSalary);
		NumberOfEmployees = numberOfEmployees;
	}



	public int getNumberOfEmployees() {
		return NumberOfEmployees;
	}

	public void setNumberOfEmployees(int numberOfEmployees) {
		NumberOfEmployees = numberOfEmployees;
	}
	
	@Override
	Long Salary() {
		return (long) (getCoefficientSalary()*2200000);
	}

	@Override
	public String toString() {
		return "Manager [Name = " + getName() + ", Date = " + getDate() + ", getCoefficientSalary = "
				+ getCoefficientSalary() + ", NumberOfEmployees = " + NumberOfEmployees + "]";
	}
	
	
	
}
