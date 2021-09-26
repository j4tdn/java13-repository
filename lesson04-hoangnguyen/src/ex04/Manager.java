package ex04;

public class Manager extends Company{
	private int numberOfManagementStaff;
	
	public Manager() {
	
	}

	public Manager(String fullName, String dayOfBirth, float coefficientsSalary, int numberOfManagementStaff) {
		super(fullName, dayOfBirth, coefficientsSalary);
		this.numberOfManagementStaff = numberOfManagementStaff;
	}

	public int getNumberOfManagementStaff() {
		return numberOfManagementStaff;
	}

	public void setNumberOfManagementStaff(int numberOfManagementStaff) {
		this.numberOfManagementStaff = numberOfManagementStaff;
	}
	
	@Override
	public int salary() {
		return (int) getCoefficientsSalary() * 2200000;
	}

	@Override
	public String toString() {
		return "Manager: " + super.toString() + ", numberOfManagementStaff= " + numberOfManagementStaff + ", Salary= " + salary();
	}
	
}
