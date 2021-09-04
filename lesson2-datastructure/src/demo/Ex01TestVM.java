package demo;

public class Ex01TestVM {
	public static void main(String[] args) {
		System.out.println("Welcome to java 13");
		System.out.println("How are you?");
		System.out.println("Enjoy your time");
		System.out.println("==============");
		publicStaticMethod();
		privateStaticMethod();
	}
	public static void publicStaticMethod() {
		System.out.println("publicStaticMethod");
	}
	private static void privateStaticMethod() {
		System.out.println("privateStaticMethod");
	}
	public void publicMethod() {
		System.out.println("public method");
	}
}
