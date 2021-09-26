package ex04;

public class Employee extends Company{
	private String department;
	
	public Employee() {
	
	}

	public Employee(String fullName, String dayOfBirth, float coefficientsSalary, String department) {
		super(fullName, dayOfBirth, coefficientsSalary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	public int salary() {
		return (int) getCoefficientsSalary() * 1250000;
	}

	@Override
	public String toString() {
		return "Employee: " + super.toString() + ", deparment= " + department + ", Salary= " + salary();
	}

}
