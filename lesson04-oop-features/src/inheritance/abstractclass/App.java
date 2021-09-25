package inheritance.abstractclass;

public class App {
	public static void main(String[] args) {
		EmailService be = new BusinessEmailServiceImpl();
		be.login();
		
		EmailService sevice = new EmailService() {
			
			@Override
			void login() {
				System.out.println("Anonymous class >> login ...");
			}
		};
		sevice.login();
	}
}
