package ex04;

public class Director extends Company{
	private float jobCoefficient;
	
	public Director() {
	
	}

	public Director(String fullName, String dayOfBirth, float coefficientsSalary, float jobCoefficient) {
		super(fullName, dayOfBirth, coefficientsSalary);
		this.jobCoefficient = jobCoefficient;
	}

	public float getJobCoefficient() {
		return jobCoefficient;
	}

	public void setJobCoefficient(float jobCoefficient) {
		this.jobCoefficient = jobCoefficient;
	}
	
	@Override
	public int salary() {
		return (int) (getCoefficientsSalary() * jobCoefficient) * 3000000;
	}

	@Override
	public String toString() {
		return "Director: " + super.toString() + ", jobCoefficient= " + jobCoefficient + ", Salary= " + salary();
	}

}
