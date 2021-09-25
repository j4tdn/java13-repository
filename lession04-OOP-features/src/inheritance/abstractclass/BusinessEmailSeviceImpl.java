package inheritance.abstractclass;

public class BusinessEmailSeviceImpl extends EmailService {

	@Override
	void login() {
		System.out.println("BusinessEmailSeviceImpl >> login....");
		
	}

	@Override
	void loginWith2Steps() {
		System.out.println("BusinessEmailSeviceImpl >> loginWith2Steps");
	}
	
	

}
