package Ex04;


public abstract class Person {
	protected String name;
	protected String dateOfBirth;
	protected float numberOfSalary;

	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, String dateOfBirth, float numberOfSalary) {

		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.numberOfSalary = numberOfSalary;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public float getNumberOfSalary() {
		return numberOfSalary;
	}

	public void setNumberOfSalary(float numberOfSalary) {
		this.numberOfSalary = numberOfSalary;
	}

	abstract double Salary();
	
	@Override
	public String toString() {
		return this.name + "\t" + this.dateOfBirth + "\t" + this.numberOfSalary;
	}
}
