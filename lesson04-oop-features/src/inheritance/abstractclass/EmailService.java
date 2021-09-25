package inheritance.abstractclass;

public abstract class EmailService {
	// abstract method >> mandatory
	abstract void login();

 	// usual method >> optional 
	void loginWith2Steps() {
		System.out.println("EmailService >> loginWith2Steps ...");
	}
}