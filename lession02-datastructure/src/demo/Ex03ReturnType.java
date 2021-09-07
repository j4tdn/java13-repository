package demo;

public class Ex03ReturnType {
	public static void main(String[] args) {
		printf("Smith");
		printf("lieu"	);
		sum(3, 4);
		
		//calculate sum 2 number
		int result = sum(2, 2);
		System.out.println("result: " +result);
		//Result is odd or even
		if (result % 2 == 0) {
			System.out.println(result + " is an even number");
		}
		else {
			System.out.println(result + "is an odd number");
		}
	}
	
		
	
	
	
	
	private static int sum(int a, int b) {
		return a+b;
	}
	
	
	
	//String >> data type
	//name > parameter name
	
	private static void printf(String name) {
		System.out.println("Heloo" + name);
	}
	
	//[Access modifier ] [static] return_type method_name (parameters){
	// body	
	// }
}
