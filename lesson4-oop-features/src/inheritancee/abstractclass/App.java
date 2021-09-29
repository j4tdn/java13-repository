package inheritancee.abstractclass;

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
				// TODO Auto-generated method stub
				System.out.println("Anonymous class >> login ...");

			}
		};
		service.login();
		JButton button = new JButton("Stop");
		button.addMouseListener(new MouseEnterListener() {
			public void mouseEntered(MouseEvent e) {
				System.out.println("Set Background >> Yellow");
			}
		});
		button.addMouseListener(new MouseAdapter() {
			public void mouseEntered(MouseEvent e) {
				System.out.println("Set Background >> Yellow");
			}
		});
	}
}
