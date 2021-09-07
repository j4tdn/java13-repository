package demo;

public class Ex01TestVM {
	public static void main(String[] args) {
		//method
		System.out.println("Welcome to Java13 class");
		System.out.println("How are you");
		System.out.println("Enjoy your time");
		System.out.println("=========");
		publicStaticMethod();
		privateStaticMethod();
	}
	
	// Access modifier : public private  protected
	public static void publicStaticMethod() {
		System.out.println("Method >publicStaticMethod");
	}
	
	public void publicMethod() {
		System.out.println("Method >publicMethod");
	}
	
	private static void privateStaticMethod() {
		System.out.println("Method > privateStaticMethod");
	}
	
	public static void main() {
		System.out.println("2nd main");
	}
	
}
