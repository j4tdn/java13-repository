package inheritance.abstractclass;

public abstract class EmailService {
	
	// astract method > mandatory for override 
	abstract void login();
	
	// unsual method >> optional for override 
	void loginWith2Step() {
		System.out.println("EmailService >> loginWith2Steps ...");
	}

}
