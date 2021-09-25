package polymorphism.object;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.drawing();
		
		Rectangle rectangle = new Rectangle();
		rectangle.drawing();
		
		Square square = new Square();
		square.drawing();
		System.out.println("==========================");
		/////////////////////////////////////////////
		//Parent p = new child(); >> OK ( Cha = new con thì được)
		//Child c = new parent(); >> NO
		Shape s1 = new Rectangle();
		s1.drawing();
		
		Shape s2 = new Square();
		s2.drawing();
		
		s1 = s2;
		s1.drawing();
		
		//Đa hình trong đối tượng pplymorphism 
		//>> flexible,easy for cating instance
		//>> hidden( che dấu) construction (khởi tạo đối tượng) >> factory pattern
		//design pattern
		
		//Rectangle r1 = (Rectangle) new Shape();//Error First
		//r1.drawing();
		
		Shape s10 = new Shape();
		Rectangle r11 = new Rectangle();
		Square s12 = new Square();
		
		s10 = r11 ; s10 = s12 ;//OK >> assign child to parent
		//r11 = s10; s12 = s10// NO
		
		Rectangle [] rs = {r11, rectangle};
		Square [] ss = {s12, square};
		
		//store shapes and shape's inherited
		Shape [] shapes = {s10,r11,s12,rectangle,square};
		System.out.println(shapes[2]);
	}
}
