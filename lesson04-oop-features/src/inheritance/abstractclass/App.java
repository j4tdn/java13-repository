package inheritance.abstractclass;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

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
		
		// Abstract class (C1)
		JButton button = new JButton("Stop");
		button.addMouseListener(new MouseEnterListener() {
			
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("Set background >> Yellow");
				
			}
		});

		// C2: Ko cần tạo Abstract Class 
		// MouseAdapter() => abstract class sẵn nên ko cần tạo nữa
		// Chỉ cần gọi hàm cần thiết (VD: mouseEntered)
		button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent e) {
				System.out.println("Set background >> Yellow");
			}
		});
	}
	
	/* Tại sao MouseAdapter() đã được override rồi nhưng vẫn là "abstract class"?
	 * + Đây là code có sẵn của thư viện
	 * + Mục đích vẫn là "abstract class" để recommend cho người code phải override lại 1 hàm cần dùng (VD: mouseEntered)
	 */
}

