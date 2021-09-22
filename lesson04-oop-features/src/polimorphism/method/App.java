package polimorphism.method;

public class App {
	public static void main(String[] args) {
		MathUtils.sum(1, 2);
		MathUtils.sum(1, 2, 3);
		
		SubPmo pmo = new SubPmo();
		System.out.println(pmo);
		
		System.out.println(pmo.coding());
	}
}
