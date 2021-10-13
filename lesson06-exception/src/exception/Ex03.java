package exception;

public class Ex03 {
	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
	
		try {
			System.out.println(devide(a, b));
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("message: " + e.getMessage());
		}
		
		System.out.println("Back to Main method");
	}
	
	private static int devide(int a, int b) {
		if(b == 0) {
			//error first
			
			throw new ArithmeticException("--div by zero /0--");
		}
		return a/b;
		

	}

}
