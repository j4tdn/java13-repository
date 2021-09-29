package inheritance.abstractclass;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class App {
	public static void main(String[] args) {
		EmailService be = new BusinessEmailSeviceImpl();
		be.login();
		be.loginWith2Steps();
		
		EmailService se = new StandardEmailServiceImpl();
		se.login();
		
		EmailService service = new EmailService() {
			
			@Override
			void login() {
				System.out.println("Anonymous class >> login....");
				
			}
		};
		service.login();
		
		
		JButton button = new JButton("Stop");
		button.addMouseListener(new MouseEnterListener() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("set Background >> yellow...");
				
			}
		});
	}
}
