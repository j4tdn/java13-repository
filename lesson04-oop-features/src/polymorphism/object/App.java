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
		// Child c = new Parent; //No at compile
		Shape s1 = new Rectangle();
		s1.drawing();
		Shape s2 = new Square();
		s2.drawing();
		
//		 Rectangle r1 =(Rectangle) new Shape();
//		 r1.drawing();
		 
		 //polymorphism 
		 // >> flexible, easy for casting instance
		 // >> hidden construction way >> factory patten
		 
		Shape s10 = new Shape();
		Rectangle r11 = new Rectangle();
		Square s12 = new Square();
		
		s10 = r11;
		s10 = s12; // OK >> assign child to parent;
		// r11 = s10;  // NO >> assign parent to child
		
		Rectangle [] rs = {r11, rectangle};
		Square [] ss = {s12, square};
		
		// store shape and shape's inherited
		Shape [] shapes = {s10,r11,s12,rectangle,square};
		// da hinh khi mà 1 phương thức hoặc đối tượng lúc thể hiện điều này, l
		// lúc thể hiện điều kia >> giúp coding sạch hơn
		
		
	}
	
}
