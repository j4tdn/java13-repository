package demo;

public class Ex01TestVM {
	// method = function
	// RunApp = Ctrl + F11
	public static void main(String[] args) {
		System.out.println("Welcome to JAVA13 class");
		System.out.println("How are you");
		System.out.println("Enjoy your time");
		System.out.println("===========");
		publicStaticMethod();
		privateStaticMethod();
	}
	
	// Access modifier: [public private] protected _
	// void: return_type
	public static void publicStaticMethod() {
		System.out.println("Method >> publicStaticMethod");
	}
	
	public void publicMethod() {
		System.out.println("Method >> publicStaticMethod");
	}
	
	private static void privateStaticMethod() {
		System.out.println("Method >> privateStaticMethod");
	}
	
	public static void main() {
		System.out.println("2nd main");
	}
}
