package demo;

public class Ex01TestVM {
	
	public static void main(String[] args) {
		System.out.println("Welcome to JAVA13 class");
		System.out.println("How are you");
		System.out.println("Enjoy your time");
		System.out.println("========================");
		publicStaticMethod();
		privateStaticMethod();
	}
	
	// Access modifier : [public private] protected default
	// void: return type
	public static void publicStaticMethod() {
		System.out.println("publicStaticMethod");
	}
	
	private static void privateStaticMethod() {
		System.out.println("privateStaticMethod");
	}
}
