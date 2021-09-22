package polymorphism.object;

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
		//Parent p = new child(); >> OK
		//Child c = new parent(); >> NO
		Shape s1 = new Rectangle();
		s1.drawing();
		
		Shape s2 = new Square();
		s2.drawing();
		
		s1 = s2;
		s1.drawing();
		
		//Rectangle r1 = (Rectangle) new Shape();//Error
		//r1.drawing();
	}
}
