package Ex04;


import java.time.LocalDate;

public class Manager extends Employment{
	
	private int numberOfEmployment;
	
	public Manager() {
		
	}
	

	public Manager(String name, LocalDate dateOfBird, int coefficientsSalary, int numberOfEmployment) {
		super(name, dateOfBird, coefficientsSalary);
		this.numberOfEmployment = numberOfEmployment;
	}
	
	public int getNumberOfEmployment() {
		return numberOfEmployment;
	}


	public void setNumberOfEmployment(int numberOfEmployment) {
		this.numberOfEmployment = numberOfEmployment;
	}


	@Override
	double salary() {
		return super.CoefficientsSalary * 2200000;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Position: Manager " + ", Number of employemt: "+ numberOfEmployment;
	}
	

}
