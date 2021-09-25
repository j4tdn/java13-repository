package inheritance.abstractclass;

public abstract class EmailService {
	
	// Abstract method >> Mandatory for override
	abstract void login();
	
	// Usual method >> Optional for override
	void loginWith2Steps() {
		System.out.println("EnailService >> loginWith2Steps ...");
	}
}
