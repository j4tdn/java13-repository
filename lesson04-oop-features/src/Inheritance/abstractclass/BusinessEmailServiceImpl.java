package Inheritance.abstractclass;

public class BusinessEmailServiceImpl extends EmailService implements Transformer, AuthorizationService{

	@Override
	void login() {
		System.out.println("BusinessEmailServiceImpl >> login ..");
	}
	@Override
	void loginWith2Steps() {
		System.out.println("BusinessEmailServiceImpl >> loginWith2Steps ..");
	}
	@Override
	public void send(boolean safeMode) {
		System.out.println("BusinessEmailServiceImpl >> send with safeMode " + safeMode);
	}
	@Override
	public void authorize(String permission) {
		System.out.println("BussinessEmailServiceImpl >> authorize " + permission);
	}
}
