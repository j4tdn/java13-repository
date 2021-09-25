package inheritance.abstractclass;

public class BussinessEmailServiceImpl  extends EmailService{

	@Override
	void login() {
		System.out.println("BussinessEmailServiceImpl >> login...");
		
	}
	@Override
	void loginWith2Steps() {
		System.out.println("BussinessEmailServiceImpl >> loginWith2Steps...");
	}

}
