package inheritance.abstractclass;

public abstract class EmailService {
	
	//abstract method
	abstract void login();
	
	//usual method>>optional foe override
	void loginWith2Steps() {
		System.out.println("EmailService >> loginWith2Steps...");
	}
}
