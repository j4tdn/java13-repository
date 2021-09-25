package inheritancee.abstractclass;

public class App {
public static void main(String[] args) {
	EmailService be = new BusinessEmailServiceImpl();
    be.login();
    
    EmailService se = new StandardEmailServiceImpl();
    se.login();
    
    EmailService service = new EmailService() {
		
		@Override
		void login() {
			// TODO Auto-generated method stub
			System.out.println("Anonymous class >> login ...");
			
		}
	};
	service.login();

}
}
