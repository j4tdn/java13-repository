package inheritance.iinterface;

public class App {
	public static void main(String[] args) {
		Shape shape1 = new Rectangle();
		shape1.drawing();
		
		Shape shape2 = new Square();
		shape2.drawing();
		
		Shape shape3 = new Shape() {
			//anonymous class >> as usual class with no name
			@Override
			public void drawing() {
				System.out.println("anonymous class >> drawing... ");
			}
		};
		shape3.drawing();
	}
}
