package inheritance.abstractclass;

public class BusinessEmailServiceImpl extends EmailService implements Transformer{

	@Override
	void login() {
		// TODO Auto-generated method stub
		System.out.println("BusinessEmailServiceImpl >> login... ");
	}
	
	@Override
	void loginWith2Step() {
		System.out.println("BusinessEmailServiceImpl >>  loginWith2Step");
	}
	
	@Override
	public void send(boolean safeMode) {
		System.out.println("BusinessEmailServiceImpl >> send with safeMode " + safeMode);
	}
	
	
}
