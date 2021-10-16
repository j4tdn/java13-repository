package exception;

public class Ex03 {
	public static void main(String[] args) {
		int a = 5;
		int b = 0;
		
		//call with no try/catch >> occur exception and crash app as normal
		//devide(a, b);
		
		try {
			System.out.println(devide(a, b));
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		
		
		System.out.println("Back to MAIN method");
	}
	
	//throw
	//throw >> function
	//throw >> available functions
	private static int devide(int a, int b) /*throws ArithmeticException */{
		if(b == 0) {
			//no mandatory to catch this exception - optional
			throw new ArithmeticException("by zero /0");
		}
		
		return a/b;
	}
	
}