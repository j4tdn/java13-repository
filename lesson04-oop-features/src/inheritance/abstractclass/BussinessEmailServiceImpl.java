package inheritance.abstractclass;

public class BussinessEmailServiceImpl  extends EmailService implements Transformer,AuthorizationService{

	@Override
	void login() {
		System.out.println("BussinessEmailServiceImpl >> login...");
		
	}
	@Override
	void loginWith2Steps() {
		System.out.println("BussinessEmailServiceImpl >> loginWith2Steps...");
	}
	@Override
	public void send(boolean safeMode) {
		System.out.println("BussinessEmailServiceImpl >> send with safeMode "+ safeMode);
		
	}
	@Override
	public void authorize(String permission) {
		System.out.println("BussinessEmailServiceImpl >> authorize "+permission);
		
	}

}
