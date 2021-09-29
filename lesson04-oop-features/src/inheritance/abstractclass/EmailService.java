package inheritance.abstractclass;

public abstract class EmailService {
	
	 //abstract method >> mandatory for override
	abstract void login();
	
	void loginWith2Steps() {
			System.out.println("EmailService >> loginWith2Steps...");
	}

	public void authorize(String permission) {
		// TODO Auto-generated method stub
		
	}

}
