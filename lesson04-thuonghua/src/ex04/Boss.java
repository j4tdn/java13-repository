package ex04;

import java.time.LocalDate;
import java.util.jar.Attributes.Name;

public class Boss extends Parent{
	private int jobCoefficient;
	
	public Boss() {
		
	}
	
	
	public Boss(String name, LocalDate date, float coefficientSalary, int jobCoefficient) {
		super(name, date, coefficientSalary);
		this.jobCoefficient = jobCoefficient;
	}


	public int getJobCoefficient() {
		return jobCoefficient;
	}


	public void setJobCoefficient(int jobCoefficient) {
		this.jobCoefficient = jobCoefficient;
	}
	
	@Override
	Long Salary() {
		return (long) ((getCoefficientSalary() + getJobCoefficient())*3000000);
	}


	@Override
	public String toString() {
		return "Boss [ Name = " + getName() + ", Date = " + getDate()
				+ ", CoefficientSalary = " + getCoefficientSalary() + ", Coefficient = " + jobCoefficient + "]"    ;
	}



	
	
	
	
	
}
