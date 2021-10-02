package inheritance.abstractclass;

public class StandardEmailServiceImpl extends EmailService implements Transformer {

	@Override // override lại hàm trừu tượng của lớp cha
	void login() {
		System.out.println("StandardEmailServiceImpl >> login ...");	
	}

	@Override
	public void send(boolean safeMode) {
		System.out.println("StandardEmailServiceImpl >> send with safeMode" + safeMode);
	}

	@Override
	public void authorize(String permission) {
		
	}	
}
