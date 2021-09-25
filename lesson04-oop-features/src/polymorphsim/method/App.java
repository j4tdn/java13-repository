package polymorphsim.method;

public class App {
	public static void main(String[] args) {
		MathUtils.sum(1, 2);
		MathUtils.sum(1, 2, 3);
		
		SubPmo sub = new SubPmo();
		System.out.println("sub: "+ sub); //auto call toString method
		System.out.println("sub: "+ sub.coding());
	}
}
