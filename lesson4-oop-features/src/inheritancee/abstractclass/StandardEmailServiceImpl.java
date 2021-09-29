package inheritancee.abstractclass;

public class StandardEmailServiceImpl extends EmailService implements Transformer,AuthorizationService{

	@Override
	void login() {
		// TODO Auto-generated method stub
		System.out.println("StandardEmailServiceImlp >> login ...");
	}

	@Override
	public void authorize(String permission) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void send(boolean safeMode) {
		System.out.println("BusinessEmailServiceImpl >> send with safeMode" + safeMode);
		
	}


}
