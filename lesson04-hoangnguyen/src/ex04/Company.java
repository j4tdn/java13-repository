package ex04;

public abstract class Company {
	private String fullName;
	private String dayOfBirth;
	private float coefficientsSalary;
	
	public Company() {
	
	}

	public Company(String fullName, String dayOfBirth, float coefficientsSalary) {
		this.fullName = fullName;
		this.dayOfBirth = dayOfBirth;
		this.coefficientsSalary = coefficientsSalary;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDayOfBirth() {
		return dayOfBirth;
	}

	public void setDayOfBirth(String dayOfBirth) {
		this.dayOfBirth = dayOfBirth;
	}

	public float getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(float coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}
	
	public abstract int salary();

	@Override
	public String toString() {
		return "fullName=" + fullName + ", dayOfBirth=" + dayOfBirth + ", coefficientsSalary="
				+ coefficientsSalary;
	}
	
	
}
