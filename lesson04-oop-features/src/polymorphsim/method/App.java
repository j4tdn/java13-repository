package polymorphsim.method;

public class App {
	public static void main(String[] args) {
		int a = MathUtils.sum(3, 4);
		System.out.println(a);
		
		SubPmo sub = new SubPmo();
		System.out.println("sub: " + sub);
		
		System.out.println("sub: " + sub.coding());
		
		
	}
}
