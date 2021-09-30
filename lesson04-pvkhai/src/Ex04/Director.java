package Ex04;


public class Director extends Person{
	private float numberOfPosition;

	public Director() {
		// TODO Auto-generated constructor stub
	}
	
	public Director(String name, String dateOfBirth, float numberOfSalary, float numberOfPosition) {
		super(name, dateOfBirth, numberOfSalary);
		this.numberOfPosition = numberOfPosition;
	}

	public float getNumberOfPosition() {
		return numberOfPosition;
	}


	public void setNumberOfPosition(float numberOfPosition) {
		this.numberOfPosition = numberOfPosition;
	}


	@Override
	double Salary() { 
		return (numberOfSalary + numberOfPosition) * 3000000;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + "\t" + this.numberOfPosition + "\t" + Salary();
	}
}
