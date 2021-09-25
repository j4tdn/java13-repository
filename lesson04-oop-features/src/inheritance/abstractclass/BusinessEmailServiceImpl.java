package inheritance.abstractclass;

public class BusinessEmailServiceImpl extends EmailService{
	@Override
	void login() {
		System.out.println("BusinessEmailServicImpl >> login ...");
	}
	
	@Override
	void loginWith2Steps() {
		System.out.println("BusinessEmailServicImpl >> loginWith2Steps ...");
	}
}