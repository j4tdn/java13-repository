package inheritance.abstractclass;

public class App {
	public static void main(String[] args) {
		EmailService be = new BussinessEmailServiceImpl();
		be.login();
		
		EmailService se = new StandardEmailServiceImpl();
		se.login();
		
		EmailService service = new EmailService() {
			
			@Override
			void login() {
				System.out.println("Anonymous class >> login ...");
				
			}
		};
		
		service.login();
	}
}
