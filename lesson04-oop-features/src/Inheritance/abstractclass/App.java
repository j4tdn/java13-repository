package Inheritance.abstractclass;

import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.event.MouseInputListener;

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
		
		JButton button = new JButton("Stop");
		button.addMouseListener(new MouseInputListener() {
			
			@Override
			public void mouseMoved(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseDragged(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("Set background >>yellow");
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		})
	}
}
