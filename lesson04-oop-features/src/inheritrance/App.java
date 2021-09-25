package inheritrance;

public class App {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		
		System.out.println(p1.digit); // 10
		System.out.println(p1.text); // parent
		p1.log();
		
		Child c1 = new Child();
		
		System.out.println(c1.digit);
		System.out.println(c1.text);
		c1.log();
		
		Parent p2 = new Child();
		System.out.println(p2.digit);
		System.out.println(p2.text); 
		p2.log();
	}
}
