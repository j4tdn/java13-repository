package inheritance.abstractclass;

public class BusinessEmailServiceImpl extends EmailService{

	@Override
	void login() {
		System.out.println("BusinessEmailServiceImpl >> login ...");
		
	}
	
	@Override
	void loginWith2Steps() {
		System.out.println("BusinessEmailServiceImpl >> login with 2 steps ...");
	}
	
}
