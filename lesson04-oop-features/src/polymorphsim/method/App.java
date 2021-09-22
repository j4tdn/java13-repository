package polymorphsim.method;

public class App {
	public static void main(String[] args) {
		MathUtils.sum(3, 4);
		MathUtils.sum(0, 0, 0);
		
		SubPmo sub = new SubPmo();
		System.out.println("SubPmo: " + sub);// mặc định kế thừa từ class object
	
		
	
	}

}
