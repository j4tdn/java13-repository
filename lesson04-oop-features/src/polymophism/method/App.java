package polymophism.method;

public class App {
	public static void main(String[] args) {
		MathUtils.sum(1, 2);
		MathUtils.sum(1, 1, 1);
		
		SubPmo sub = new SubPmo();
		System.out.println("sub: " + sub);
		
		System.out.println("sub: " + sub.coding());
	}
}
