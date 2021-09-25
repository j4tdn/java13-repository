package inheritance.iinterface;

public class App {
	public static void main(String[] args) {
		Shape s1 = new Rectangle();
		Shape s2 = new Square();
		
		s1.drawing();
		s2.drawing();
		
		/* Shape s = new Shape() {
			// anonymous class >> as usual class with no name
			
			@Override
			public void drawing() {
				System.out.println("Anonymous class >> drawing ...");
				
			}
		};*/
		Shape s = new Anonymous();
		s.drawing();
	}
}
