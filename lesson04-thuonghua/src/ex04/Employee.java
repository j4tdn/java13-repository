package ex04;

import java.time.LocalDate;

public class Employee extends Parent{
	private String partName;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	
	public Employee(String name, LocalDate date, float coefficientSalary, String partName) {
		super(name, date, coefficientSalary);
		this.partName = partName;
	}


	public String getPartName() {
		return partName;
	}

	public void setPartName(String partName) {
		this.partName = partName;
	}

	@Override
	Long Salary() {
		return (long) (getCoefficientSalary()*1250000);
	}

	@Override
	public String toString() {
		return "Employee [ Name = " + getName() + ", Date = " + getDate()
				+ ", CoefficientSalary = " + getCoefficientSalary()  + ", PartName = " + partName + " ]" ;
	}



	
	
}
