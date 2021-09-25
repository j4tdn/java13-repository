package inheritance.iinterface;

public class App {
	public static void main(String[] args) {
		
		Shape s1 = new Rectangle();
		s1.drawing();
		
		Shape s2 = new Square();
		s2.drawing();
		
		// Cannot create an object of Interface type without overloading
		// Shape s = new Shape();
		// s.drawing();
		
		Shape s3 = new Shape() {
			// anonymous class
			// usual class with no name
			@Override
			public void drawing() {
				System.out.println("Viet Dzai >> Anonymous class >> drawing ...");
			}
		};
		s3.drawing();
		
		
		Shape s4 = new Anonymous();
		
		s4.drawing();
	}
}