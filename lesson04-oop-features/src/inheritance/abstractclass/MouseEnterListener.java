package inheritance.abstractclass;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public abstract class MouseEnterListener implements MouseListener {

	// Mục đích tạo abstract class
	// Total có 5 cái 
	// 4 cái không liên quan => bỏ ở abstract class này 
	// 1 cái liên quan sẽ được override ở App.java
	// Nếu ko có abstract class này thì:
	// + Ở App.java có 5 hàm được override, trong khi chỉ cần 1 => code bẩn
	
	// MouseListener() => interface => tự động override bên dưới
	@Override
	public void mouseClicked(MouseEvent e) {		
	}

	@Override
	public void mousePressed(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	// mouseEnter
	// HÀM NÀY Ở APP.JAVA
	/**@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Set background >> yellow");
		
	}*/

	@Override
	public void mouseExited(MouseEvent e) {
	}

}
