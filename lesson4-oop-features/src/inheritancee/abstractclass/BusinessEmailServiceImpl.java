package inheritancee.abstractclass;

public class BusinessEmailServiceImpl extends EmailService {

	@Override
	void login() {
		// TODO Auto-generated method stub
		System.out.println("BusinessEmailServiceImpl >> login...");
	}
	@Override
	void loginWith2Steps() {
		System.out.println("BusinessEmailServiceImpl >> loginWith2Steps ...");
	}

}
