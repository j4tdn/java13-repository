package ex04;

public class Manager extends Company{
	private int numberOfManagementStaff;
	
	public Manager() {
		// TODO Auto-generated constructor stub
	}

	
	

	public Manager(String fullName, String dateOfBirth, float coefficientsSalary,int numberOfManagementStaff ) {
		super(fullName, dateOfBirth, coefficientsSalary);
		this.numberOfManagementStaff = numberOfManagementStaff;
	}
	public int getNumberOfManagementStaff() {
		return numberOfManagementStaff;
	}

	public void setNumberOfManagementStaff(int numberOfManagementStaff) {
		this.numberOfManagementStaff = numberOfManagementStaff;
	}


	@Override
	public long salary() {	
		return (long) (this.getCoefficientsSalary()*2200000);
	}


	@Override
	public String toString() {
		return "Manager [FullName()=" + getFullName() + ", DateOfBirth()=" + getDateOfBirth()
				+ ", CoefficientsSalary()=" + getCoefficientsSalary() + ", numberOfManagementStaff="
				+ numberOfManagementStaff + ", salary()=" + salary() + "]";
	}
	
	

}
