package ex04;

public class Director extends Company {
	private float jobCoefficient;
	
	public Director() {
		// TODO Auto-generated constructor stub
	}
	
	public Director(String fullName, String dateOfBirth, float coefficientsSalary,float jobCoefficient) {
		super(fullName, dateOfBirth, coefficientsSalary);
		this.jobCoefficient = jobCoefficient;
	}

	public float getJobCoefficient() {
		return jobCoefficient;
	}

	public void setJobCoefficient(float jobCoefficient) {
		this.jobCoefficient = jobCoefficient;
	}


	@Override
	public long salary() {
		return (long) (this.getCoefficientsSalary()*3000000);
	}


	@Override
	public String toString() {
		return "Director [FullName()=" + getFullName() + ", DateOfBirth()=" + getDateOfBirth()
				+ ", CoefficientsSalary()=" + getCoefficientsSalary() + ", jobCoefficient=" + jobCoefficient
				+ ", salary()=" + salary() + "]";
	}
	

}
