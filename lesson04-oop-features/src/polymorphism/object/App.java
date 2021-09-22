package polymorphism.object;

public class App {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.drawing();
		Rectangle rectangle = new Rectangle();
		rectangle.drawing();
		Square square = new Square();
		square.drawing();
		
		
		Shape s1 = new Rectangle();
		s1.drawing();
		Shape s2 = new Square();
		s2.drawing();
		
		s1 = s2;
		s1.drawing();
		// rectangle = new Shape(); // compile error
		////////////////////////////////////////////
		
	}
}
