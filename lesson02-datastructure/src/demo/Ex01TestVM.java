package demo;

public class Ex01TestVM {
	public static void main(String[] args) {
		System.out.println("Welcome to JAVA13 class");
		System.out.println("How are you");
		System.out.println("Enjoy your time");
		publicStaticMethod();
		privateStaticMethod();
	}
	
	public static void publicStaticMethod() {
		System.out.println("Method >> publicStaticMethod");
	}
	
	public void publicEx01Method() {
		
	}
	
	private static void privateStaticMethod() {
		System.out.println("Method >> privateStaticMethod");
	}
}
