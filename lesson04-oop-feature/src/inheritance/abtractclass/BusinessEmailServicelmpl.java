package inheritance.abtractclass;

public class BusinessEmailServicelmpl extends EmailService {
	@Override
	void login() {
		System.out.println("BussinessEmailServiceImpl >> login...");
		
	}
	@Override
	void loginWith2Steps() {
		System.out.println("BussinessEmailServiceImpl >> loginWith2Steps...");
	}
}
