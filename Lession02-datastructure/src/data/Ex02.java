package data;

public class Ex02 {
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		System.out.println("a1 :" + a);
		System.out.println("b1 :" + b);
		
		a = b;
		
		System.out.println("a2 :" + a);
		System.out.println("b2 :" + b);
		
		a = 15;
		System.out.println("a3:" + a);
		//a = 15
		modifi(b);
		System.out.println("a4:" + b);
	}
	//pass by value ll referencr
	private static void modifi(int a) {
		a = 99;
		System.out.println("ablue" + a);
	}
}
