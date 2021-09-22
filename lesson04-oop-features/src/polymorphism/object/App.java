package polymorphism.object;

public class App {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.drawing();
		
		Rectangle rectangle = new Rectangle();
		rectangle.drawing();
		
		Square  square = new Square();
		square.drawing();
		
		// Parent p = new Child; OK
		// Child c = new Parent
		Shape s1 = new Rectangle();
		s1.drawing();
		Shape s2 = new Square();
		s2.drawing();
		
//		 Rectangle r1 =(Rectangle) new Shape();
//		 r1.drawing();
		 
		 //polymorphism 
		 // >> flexible, easy for casting instance
		 // >> hidden construction way >> factory patten
		 
	}
	
}
