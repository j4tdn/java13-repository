package polymorphsim.object;

import javax.swing.BorderFactory;

public class App {

		public static void main(String[] args) {
			Shape shape = new Shape();
			
			Rectangle rec = new Rectangle();
			
			Square sq = new Square();
			
			shape.drawing();
			rec.drawing();
			sq.drawing();
			
			System.out.println("==============");
			
			Shape s1 = new Rectangle();
			s1.drawing();
			
			Shape s2 = new Square();
			s2.drawing();
			
			s1 = s2;
			s1.drawing();
			
			//Child c = new Parent(); 
			//Rectangle r1 = (Rectangle) new Shape();
			//r1.drawing();
			//r1.setBackGround();
			
			Shape s10 = new Shape();
			Rectangle r11 = new Rectangle();
			Square s12 = new Square();
			
			s10 = r11; s10 = s12;//OK >>assign child to parent
			//r11 = s10; s12 = s10;//NO
			
			Rectangle[] rs = {r11, rec};
			Square[] ss = {s12, sq};
			
			Shape[] shapes = {s10, r11, s12, rec, sq};
			
	}

}
