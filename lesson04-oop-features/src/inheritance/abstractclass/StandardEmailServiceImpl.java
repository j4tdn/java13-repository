package inheritance.abstractclass;

public class StandardEmailServiceImpl extends EmailService implements Transformer{

	@Override
	void login() {
		System.out.println("StandardEmailServiceImpl >> login ...");
	}

	@Override
	public void send(boolean safeMode) {
		System.out.println("StandardEmailServiceImpl >> send with safeMode" + safeMode);
	}

	@Override
	public void authoriza(String permission) {
		System.out.println("StandardEmailServiceImpl >> authoriza with permission" + permission);
	}
	
}
