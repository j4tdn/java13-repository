package inheritance.abstractclass;

public class BussinessEmailServiceImpl extends EmailService implements Transformer,Authorization{

	@Override
	void login() {
		System.out.println("BussinessEmailServiceImpl >> login..");
		
	}
	@Override
	void loginWith2Steps() {
	System.out.println("BussinessEmailServiceImpl >> logWith2Steps..");
	}
	@Override
	public void send(boolean safeMode) {
		System.out.println("BusinessHEmailSweviceImpl >> send with safeMode" + safeMode);
		
	}
	@Override
	public void authorize(String permission) {
		System.out.println("BusinessHEmailSweviceImpl >> authorize " + permission);
		
	}

}
