package demo;

public class Ex03ReturnType {
	public static void main(String[] args) {
		printf("Bo");
		printf("Bom");
		int x = sum(2, 3);
		if(x % 2 == 0) System.out.println(x + " is even number");
		else System.out.println(x+ " is odd number");
	}
	private static int sum(int a, int b) {
		return a+ b;
	
	}
	public static void printf(String name) {
		System.out.println("hello " + name);
	}
}
