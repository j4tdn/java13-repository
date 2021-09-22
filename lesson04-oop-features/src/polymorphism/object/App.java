package polymorphism.object;

// polymorphism
// >> flexible , easy for casting instance
// >> hidden construction way

public class App {
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.drawing();
		
		Rectangle rectangle = new Rectangle();
		rectangle.drawing();
		
		Square square = new Square();
		square.drawing();
		
		System.out.println("==========");
		// compile : là lúc code , save
		// Runtime : lúc khi mình chạy lên , biết tạo ra đối tương trên Head gọi là runtime
		
		/////////////////////////////////
		// Parent p = new Child();
		Shape s1 = new Rectangle();
		s1.drawing();
		
		Shape s2 = new Square();
		s2.drawing();
		
		s2 = s1;
		s2.drawing();
		
		System.out.println("==========");
		
		/////////////////////////////
		// Child c = new Parent(); No Ok
		//Rectangle r1 =(Rectangle) new Shape();// Error ko cho ép kiểu từ shape qua rectangle
		//r1.drawing();
	
	}

}
