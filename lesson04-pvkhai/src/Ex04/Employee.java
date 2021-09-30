package Ex04;


public class Employee extends Person{
	private String department;
	public Employee() {
		// TODO Auto-generated constructor stub
	}
	
	public Employee(String name, String dateOfBirth, float numberOfSalary, String department) {
		super(name, dateOfBirth, numberOfSalary);
		this.department = department;
	}

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Override
	double Salary() {
		return numberOfSalary * 1250000;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\t" + this.department + "\t" + Salary();
	}
}
