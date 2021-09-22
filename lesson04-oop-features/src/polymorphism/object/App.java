package polymorphism.object;

public class App {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.drawing();
		
		Rectangle rectangle = new Rectangle();
		rectangle.drawing();
		
		Square square = new Square();
		square.drawing();
		//////
		System.out.println("============");
		//Parent p = new Child();//ok
		//Child c = new Parent();//no at compile
		//compile,runtime
		Shape s1 = new Rectangle();
		s1.drawing();//resctange>>drawing
		
		Shape s2 = new Square();
		s2.drawing();//square>>drawing
		
		s1=s2;
		s1.drawing();//square>>drawing
		
		//polymorphism
		//>>flexible ,easy for casting instance
		
		
		Rectangle r1 =(Rectangle) new Shape();//error first
		r1.drawing();
		
		
	}
}
