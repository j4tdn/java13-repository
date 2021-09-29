package inheritance.abstractclass;

public class BusinessEmailSeviceImpl extends EmailService implements Transformer,AuthorizationService {

	@Override
	void login() {
		System.out.println("BusinessEmailSeviceImpl >> login....");
		
	}

	@Override
	void loginWith2Steps() {
		System.out.println("BusinessEmailSeviceImpl >> loginWith2Steps");
	}

	@Override
	public void send(boolean safeMode) {
		System.out.println("BusinessEmailSeviceImpl >> send with safeMode " + safeMode);
		
	}

	@Override
	public void authoriza(String permission) {
		System.out.println("BusinessEmailSeviceImpl >> send with authoriza" + permission);
		
	}
	
	

}
