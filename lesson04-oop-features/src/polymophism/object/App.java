package polymophism.object;

public class App {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.drawing();
		
		Rectangle rectangle = new Rectangle();
		rectangle.drawing();
		
		Square square = new Square();
		square.drawing();
		
		////////////////////////////////////////
		// Parent p = new Child(); >> OK
		// Child c = new Parent(); >> No at compile
		System.out.println("=========================");
		// compile, runtime
		
		Shape s1 = new Rectangle();
		s1.drawing(); // Rectangle >> drawing
		
		Shape s2 = new Square();
		s2.drawing(); // Square >> drawing
		
		s1 = s2;
		s1.drawing(); // Square >> drawing
		
		// Rectangle r1 = (Rectangle) new Shape();  // Error First
		// r1.drawing();
		
		// polymorphism
		// >> flexible, easy for casting instance
		// >> hidden construction way >> factory pattern
		
	}
}
