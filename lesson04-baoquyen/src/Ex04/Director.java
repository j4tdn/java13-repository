package Ex04;


import java.time.LocalDate;

public class Director extends Employment{
	
	private int coefficientJob;
	
	public Director() {
		
	}
	  
	 
	public Director(String name, LocalDate dateOfBird, int coefficientsSalary, int coefficientJob) {
		super(name, dateOfBird, coefficientsSalary);
		this.coefficientJob = coefficientJob;
	}


	public int getCoefficientJob() {
		return coefficientJob;
	}


	public void setCoefficientJob(int coefficientJob) {
		this.coefficientJob = coefficientJob;
	}

	@Override
	double salary() {
		return (super.CoefficientsSalary + coefficientJob)* 3000000;
		
	}


	@Override
	public String toString() {
		return super.toString()+ " Position: Director ";
	}
	
	
	
}
