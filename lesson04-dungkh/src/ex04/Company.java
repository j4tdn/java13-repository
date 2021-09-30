package ex04;

public abstract class Company {
	private String fullName;
	private  String dateOfBirth;
	private  float coefficientsSalary;
	
	public Company() {
		// TODO Auto-generated constructor stub
	}

	public Company(String fullName, String dateOfBirth, float coefficientsSalary) {
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.coefficientsSalary = coefficientsSalary;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public float getCoefficientsSalary() {
		return coefficientsSalary;
	}

	public void setCoefficientsSalary(float coefficientsSalary) {
		this.coefficientsSalary = coefficientsSalary;
	}
	public abstract long salary();
	
	@Override
	public String toString() {
		return "Company [fullName=" + fullName + ", dateOfBirth=" + dateOfBirth + ", coefficientsSalary="
				+ coefficientsSalary + "]";
	}

}
