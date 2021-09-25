   package polymorphism.object;


public class App {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.drawing();
		
		Rectangle rectangle = new Rectangle();
		rectangle.drawing();
		
		Square square = new Square();
		square.drawing();
		
		System.out.println("====================================");
		// Parent p = new Child(); OK
		// Child c = new Parent(); NO at compile
		
		// Compile, runtime
		
		Shape s1 = new Rectangle();
		s1.drawing();
		
		Shape s2 = new Square();
		s2.drawing();
		//polymorphism
		// >> flexible, easy for casting instance
		// >> hidden construction way >>factory pattern
		
		// Rectangle r1 = (Rectangle) new Shape(); // Error
		// r1.drawing();
		// r1.setBackground();
		
		
		Shape s10 = new Shape();
		Rectangle r11 = new Rectangle();
		Square s12 = new Square();
		
		s10 = r11; s10 = s12; //OK >> assign child to parent
		//r11 = s10; s12 = s10; //NO >> assign parent to child
		
		Rectangle[] rs = {r11, rectangle};
		Square[] ss = {s12, square};
		
		// store shape and shape's inherited
		Shape[] shapes = {s10, r11, s12, rectangle, square};
		
	}
}
