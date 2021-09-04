package demo;

public class Ex01TestVM {
	public static void main(String[] args) {
			System.out.println("Welcome to java 13");
			System.out.println("Where are you");
			System.out.println("How are you");
			publicStaticMethod();
			privateStaticMethod();
			
		}
	public static void publicStaticMethod() {
		System.out.println("publicStaticMethod");
	}
	public void publicNonStaticMethod() {
		System.out.println("publicNonStaticMethod");
	}
	private static void privateStaticMethod() {
		System.out.println("privateStaticMethod");
	}
}
