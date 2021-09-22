package polymorphism.object;

public class App {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.drawing();
		
		Rectangle rectangle = new Rectangle();
		rectangle.drawing();
		
		Square square = new Square();
		square.drawing();
		
		//rectangle = new Square();
		//square = new Rectangle();
		
		//////////////////////////////////////
		// Parent p = new Child();
		
		System.out.println("===================");
		// compile, runtime
		
		Shape s1 = new Rectangle();
		s1.drawing(); // Rectangle >> drawing
		

		Shape s2 = new Square(); // Square >> drawing
		s2.drawing();
		
		s1 = s2;
		s1.drawing();
		
		// polymorphism
		// >> flexible, easy for casting instance
		// >> hidden constructor way >> factory pattern >> next
		
		//Rectangle r1 = (Rectangle) new Shape(); // Error First
		//r1.drawing();
		//r1.setBackground();
	}
}
