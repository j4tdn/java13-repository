package demo;

public class Ex03ReturnType {
	public static void main(String[] args) {
		printf("Tan");
		
		System.out.println("==============");
		
		int result = sum(2,3);
		System.out.println("result = " + result);
	}
	
	private static int sum(int a, int b) {
		return a + b;
	}
	
	//String >> data_type;
	//name >> parameter_name
	private static void printf(String name) {
		System.out.println("Hello" + name);
	}
}
