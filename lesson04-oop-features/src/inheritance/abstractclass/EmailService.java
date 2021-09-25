package inheritance.abstractclass;

public abstract class EmailService {
	
	//usual method >> mandatory for override
	abstract void login();
	
	//usual method >> optional for override
	void loginWith2Steps() {
		System.out.println("EmailService >> loginWith2Steps ..");
	}
}
