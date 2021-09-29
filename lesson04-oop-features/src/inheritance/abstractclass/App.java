package inheritance.abstractclass;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


import javax.swing.JButton;

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
		JButton button = new JButton("Stop");
		button.addMouseListener(new MouseEnterListener() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("Set background >> Yellow");
				
			}
		});
		
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("Set background >> Yellow");
			}
		});
	}
}
