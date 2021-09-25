package inheritance.abstractclass;

public abstract class EmailService {
	
	// abstract method >> mandatory for overriding
	abstract void login();
	
	//usual method >> optional for overriding
	void loginWith2Steps() {
			System.out.println("Email Service >> loginWith2Steps");
	}
}
