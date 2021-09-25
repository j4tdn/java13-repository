package inheritance.abstractclass;

public class App {
	public static void main(String[] args) {
		EmailService es = new EmailService() {
			
			@Override
			void login() {
				System.out.println("Anonymous >> login ...");
			}
		};
		es.login();
		es.loginWith2Steps();
		
		BusinessEmailServiceImpl businessEmailServiceImpl = new BusinessEmailServiceImpl();
		businessEmailServiceImpl.login();
		businessEmailServiceImpl.loginWith2Steps();
		
		StandardEmailServiceImpl standardEmailServiceImpl = new StandardEmailServiceImpl();
		standardEmailServiceImpl.login();
		standardEmailServiceImpl.loginWith2Steps();
	}
}