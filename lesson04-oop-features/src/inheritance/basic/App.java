package inheritance.basic;

public class App {
	
	public static void main(String[] args) {
		Parent p1 = new Parent();
		System.out.println(p1.digit);
		System.out.println(p1.text);
		p1.log();
		
		System.out.println("======================");
		
		Child c1 = new Child();
		System.out.println(c1.digit);
		System.out.println(c1.text);
		c1.log();
		
		System.out.println("======================");
		
		Parent p2 = new Child();
		System.out.println(p2.digit); // 10
		System.out.println(p2.text); // Parent
		p2.log(); // Child >> logging ...
	}
}
