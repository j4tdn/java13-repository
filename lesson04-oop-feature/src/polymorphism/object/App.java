package polymorphism.object;

public class App {
	public static void main(String[] args) {
		MathUtils.sum(2, 3);
		MathUtils.sum(2, 3, 4);
		SubPmo sub = new SubPmo();
		System.out.println("Sub: "+ sub);
		System.out.println("sub: "+ sub.coding());
	}
}
