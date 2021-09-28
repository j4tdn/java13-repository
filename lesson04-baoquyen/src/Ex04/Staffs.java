package Ex04;


import java.time.LocalDate;

public class Staffs extends Employment{
	private String department;
	
	public Staffs() {
		
	}

	public Staffs(String name, LocalDate dateOfBird, int coefficientsSalary, String department) {
		super(name, dateOfBird, coefficientsSalary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	double salary() {
		return (super.CoefficientsSalary)*1250000;
	}
	@Override
	public String toString() {
		return super.toString() + " Position : Staffs, Department: " + department;
	}
	
	
}
