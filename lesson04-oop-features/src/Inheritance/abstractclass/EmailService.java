package Inheritance.abstractclass;

public abstract class EmailService {
	//usual method
	abstract void login();
	
	
	void loginWith2Steps() {
		System.out.println("EmailService >> loginWith2Steps");
		
	}
}
