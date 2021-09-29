package inheritance.abstractclass;

public class StandardEmailServiceImpl extends EmailService implements Transformer{
	@Override
	void login() {
		System.out.println("StandardEmailServiceImpl >> login ...");
	}

	@Override
	public void authorize(String permission) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void send(boolean safeMode) {
		// TODO Auto-generated method stub
		
	}
}