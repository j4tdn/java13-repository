package polymorphsim.object;

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
	}

}
