package inheritance.abstractclass;

public class BusinessEmailServiceImpl extends EmailService implements Transformer, AuthorizationService{
	@Override
	void login() {
		System.out.println("BusinessEmailServicImpl >> login ...");
	}
	
	@Override
	void loginWith2Steps() {
		System.out.println("BusinessEmailServicImpl >> loginWith2Steps ...");
	}
	
	@Override
	public void send(boolean safeMode) {
		System.out.println();
		
	}
	@Override
	public void authorize(String permission) {
		System.out.println();
		
	}
	
}