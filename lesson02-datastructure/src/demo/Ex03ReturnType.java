package demo;

public class Ex03ReturnType {
	public static void main(String[] args) {
		printf("Smith");
		printf("John");
		printf("Kahn");
		int result = sum(1,2);
		System.out.println("Result : "+ result);
		
		if (result % 2 == 0) {
			System.out.println(result + " is an even number");
		}
		else {
			System.out.println(result + " is odd even number");
		}
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}	
	private static void printf(String name) {
		System.out.println("Hello " + name);
	}
}
