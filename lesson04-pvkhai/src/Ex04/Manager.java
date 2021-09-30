package Ex04;


public class Manager extends Person{
	private int numberOfEmployee;
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	public Manager(String name, String dateOfBirth, float numberOfSalary, int numberOfEmployee) {
		super(name, dateOfBirth, numberOfSalary);
		this.numberOfEmployee = numberOfEmployee;
	}

	public int getNumberOfEmployee() {
		return numberOfEmployee;
	}
	public void setNumberOfEmployee(int numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}

	@Override
	double Salary() {
		// TODO Auto-generated method stub
		return numberOfSalary * 2200000;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\t" + this.numberOfEmployee + "\t" + Salary();
	}

}
