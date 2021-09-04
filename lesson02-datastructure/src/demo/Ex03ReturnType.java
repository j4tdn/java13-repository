package demo;

public class Ex03ReturnType {
	public static void main (String[] args) {
		printf("Smith");
		printf("John");
		printf("Kahn");
		
		System.out.println("==================");
		
		// Calculate sum of 2 numbers >> result
		int result = sum(2,3);
		System.out.println("result: "+ result);
		
		//Result is odd(false) or even(true)
		if(result % 2 == 0) {
			System.out.println(result + " is an even number");
		} else {
			System.out.println(result + " is an odd number");
		}
		
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}
	
	// String >> data_type
	// name >> parameter_name
	private static void printf(String name) {
		System.out.println("Hello " + name);
	}
	
	// [Access modifier] [static] return_type method_name(parameters) {
	// body
	//}
}
