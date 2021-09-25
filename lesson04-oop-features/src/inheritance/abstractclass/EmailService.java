package inheritance.abstractclass;

public abstract class EmailService {
	
	 //abstract method >> mandatory fofr override
	abstract void login();
	
	void loginWith2Steps() {
			System.out.println("EmailService >> loginWith2Steps...");
	}

}
