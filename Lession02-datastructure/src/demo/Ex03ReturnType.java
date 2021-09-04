package demo;

public class Ex03ReturnType {
	public static void main(String[] args) {
		printf("Vu");
		printf("Viet"); 
		printf("Anh");
		//calculate sum of 2 nembers
		int result = sum(2, 2);
		System.out.println("result : " + result);
	
		
		//result is odd(false)  or even (true)
		if (result % 2 ==0) {
			System.out.println(result + "is an even nember");
			}
		else {
			System.out.println(result + "is an add nember");
		}
	}
	
		
		private static int sum(int a, int b) {
			return a + b;
			
		}
	
		//String >> data_type
		//name >> parameter_name
	private static void printf(String name) {
		System.out.println("Hello " + name);
	}
	//[Access modifier] [static] Return_type method_name(parameters) {
						//cau truc ham//
}
