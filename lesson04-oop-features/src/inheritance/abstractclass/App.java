package inheritance.abstractclass;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class App {
	public static void main(String[] args) {
		EmailService be = new BusinessEmailServiceImpl();
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
		
		// Abstract class
		JButton button = new JButton("Stop");
		button.addMouseListener(new MouseEnterListener() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("Set Background >> Yellow");
			}
		});
		
		button.addMouseListener(new MouseAdapter() {
			// recommend
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("Set Background >> Yellow");
			}
		});
	}
}
