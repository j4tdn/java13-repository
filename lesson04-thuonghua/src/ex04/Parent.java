package ex04;

import java.time.LocalDate;
import java.util.Date;

public class Parent {
	private String name;
	private LocalDate date;
	private float coefficientSalary;
	
	
	public Parent() {
		// TODO Auto-generated constructor stub
	}

	public Parent(String name, LocalDate date, float coefficientSalary) {
		this.name = name;
		this.date = date;
		this.coefficientSalary = coefficientSalary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public float getCoefficientSalary() {
		return coefficientSalary;
	}

	public void setCoefficientSalary(float coefficientSalary) {
		this.coefficientSalary = coefficientSalary;
	}
	
	Long Salary() {
		return (long) ((getCoefficientSalary())*1250000);
	}

	@Override
	public String toString() {
		return "Parent [name=" + name + ", date=" + date + ", coefficientSalary=" + coefficientSalary + "]";
	}
	
	
}
