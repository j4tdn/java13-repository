package exeption;


public class Ex03 {
	public static void main(String[] args) {
		int a = 5;
		int b = 0;
	try {
		System.out.println(devide(a, b));
	} catch (ArithmeticException e) {
		e.printStackTrace();
	}
		
	}
	
	private static int devide(int a, int b)Ơ
	if(b == 0) {
		throw new ArithmeticException("div by zero");
	}
}
