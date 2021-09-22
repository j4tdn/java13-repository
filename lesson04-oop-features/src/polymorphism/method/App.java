package polymorphism.method;

public class App {
	public static void main(String[] args) {
		MathUtils.sum(2, 3);
		MathUtils.sum(2, 3, 4);
		
		SubPmo sub = new SubPmo();
		System.out.println("sub: " + sub) ; // auto call toString method
		
		System.out.println("sub: " + sub.coding());
	}
}
