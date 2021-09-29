package inheritance.abstractclass;

import javax.swing.JButton;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.*;

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
		
		//Abstract	class
		JButton button = new JButton("Stop");
		button.addMouseListener(new MouseEnterListener() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
	}
}