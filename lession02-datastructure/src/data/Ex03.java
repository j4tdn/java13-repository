package data;

public class Ex03 {
	public static void main(String[] args) {
		int a = 4;
		int b = 22;
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
		swap(a,b);
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
	}
	
	private static void swap(int a,int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		
	}
}
