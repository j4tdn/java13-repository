package demo;

public class Ex03ReturnType {
	public static void main(String[] args) {
		printf("Smith");
		printf("John");
		printf("Kahn");
		System.out.println("=============");
		int result = sum(2,2);
		System.out.println("result: "+ result);
		if(result % 2 == 0) {
			System.out.println(result + " is an even number");
		}else {
			System.out.println(result + " is an odd number");
		}
	}
	
	private static int sum(int a, int b) {
		return a+b;
	}
	
	private static void printf(String name) {
		System.out.println("Hello "+ name);
	}
}
