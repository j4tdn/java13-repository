package demo;

public class Ex03ReturnType {
	
	public static void main(String[] args) {
		printf("Roll");
		
		System.out.println("=============");
		
		// Calculate sum of 2 numbers >> result
		int result = sum(5,2);
		System.out.println("result: " + result);
		
		// Result is odd(false) or even(true);
		if(result % 2 == 0) {
			System.out.println(result + " is an even number");
		}else {
			System.out.println(result + " is an odd number");
		}
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}
	
	private static void printf(String name) {
		
		System.err.println("Hello " + name);
	}
	
	// [Access Modifier] [static] return_type method_name(parameters) 
}
