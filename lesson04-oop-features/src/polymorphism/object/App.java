package polymorphism.object;

// polymorphism
// >> flexible , easy for casting instance
// >> hidden construction way >> factory parttern
/* Design Patterns :là những cách giải quyết bài toán được
  xây dwujng đưa ra từ những dev đi trước, học cách của 
  giải quyết nnt nào giúp code mình nhanh hơn hơn dễ hiểu hơn
*/
/* Factory patterns 
*/
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
		
		Shape s10 = new Shape();
		Rectangle r11 = new Rectangle();
		Square s12 = new Square();
		
		s10 = r11; s10 = s12; // ok >> assign child to pass
		//r11 = s10; s12 = s10 // no >> assign parrent to child
		
		Rectangle[] rs = {r11, rectangle};
		Square[] ss = {s12, square};
		
		// store shape and shape's inherited
		Shape[] shpaes = {s10, r11, s12, rectangle,square};
	}

}
