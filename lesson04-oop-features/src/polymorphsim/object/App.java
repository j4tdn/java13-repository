package polymorphsim.object;

public class App {
	public static void main(String[] args) {
		
		Shape shape = new Shape();
		shape.drawing();
		
		Rectangle rectangle = new Rectangle();
		rectangle.drawing();
		
		Square square= new Square();
		square.drawing();
		
		/////
		
		Shape s10 = new Shape();
		Rectangle r11 = new Rectangle();
		Square s12 = new Square();
		
		s10 = r11; s10 = s12; // OK >> child to parent
		// r11 = s10; s12 = s10; no OK >> parent to child
		
		Rectangle[] rs = {r11, rectangle};
		Square[] ss = {s12, square};
		
		// store shape and shape's inherited
		Shape[] shapes = {s10,r11,s12,rectangle,square};
	}
}
