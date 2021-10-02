package inheritance.abstractclass;

public class BusinessEmailServiceImpl extends EmailService implements Transformer, AuthorizationService {
	
	@Override // override lại hàm trừu tượng của lớp cha
	void login() {
		System.out.println("BusinessEmailServiceImpl >> login ...");
	}
	
	@Override
	void loginWith2Step() {
		System.out.println("BusinessEmailServiceImpl >> loginWith2Steps ...");
	}

	@Override
	public void send(boolean safeMode) {
		System.out.println("BusinessEmailServiceImpl >> send with safeMode " + safeMode);
	}

	@Override
	public void authorize(String permission) {
		System.out.println("BusinessEmailServiceImpl >> authorize " + permission);
		
	}
	

}
