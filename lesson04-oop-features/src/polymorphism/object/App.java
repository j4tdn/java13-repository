package polymorphism.object;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.border.Border;

public class App {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.drawing();
		
		Rectangle rectangle = new Rectangle();
		rectangle.drawing();
		
		Square square = new Square();
		square.drawing();
		
		///////////////////////////////////
		
		System.out.println("==================");
		
		// Parent p = new Child(); => OK
		// compile, runtime
		Shape s1 = new Rectangle();
		s1.drawing(); // Rectangle >> drawing
		
		Shape s2 = new Square();
		s2.drawing(); // Square >> drawing
		
		// Sau một thời gian Rectangle biến thành Square thì:
		s1 = s2;
		s1.drawing(); // Square >> drawing
		
		// polymorphism
		// >> flexible, easy for casting instance (dễ dàng cho việc chuyển kiểu)
		// >> hidden construction way >> factory pattern
		
		// Child c = new Parent(); => NO
		// Rectangle r1 = (Rectangle) new Shape(); // Error First
		// r1.drawing();
		// r1.setBackground();
		
		Shape s10 = new Shape();
		Rectangle r11 = new Rectangle();
		Square s12 = new Square();
		
		s10 = r11; s10 = s12; // OK >> assign child to parent
		// r11 = s10; s12 = s10; // NO >> cannot assign parent to child
		
		Rectangle[] rs = {r11, rectangle};
		Square[] ss = {s12, square};
		
		// Thay vì lưu thành hai mảng và phải duyệt từng mảng thì làm như bên dưới sẽ tối ưu
		// store shape and shape's inherited
		Shape[] shapes = {s10, r11, s12, rectangle, square};
		
	}

}
