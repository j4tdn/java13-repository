package exception;

/**
 * Opt3: check condition and throw exception before calling function
 * throw from function and being catch at called function
 */

public class Ex03 {
	public static void main(String[] args) {
		// a / b >> type: int, b = 0
		int a = 5;
		int b = 0;
		
		// call >> with no try/catch >> occur exception and crash as normal
		// System.out.println(devide(a, b));
	
		try {
			System.out.println(devide(a, b));
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("message" + e.getMessage());
		}
		
		System.out.println("Back to main method");
	}
	
	// C1: a, b(validation != 0)
	// C2: a, b(no validation) >> try catch
	// C3: a, b(no validation) >> crash app
	
	// throw
	// throw >> function
	// throw >> available functions
	private static int devide(int a, int b) {
		if(b == 0) {
			// error first
			// no mandatory to catch this exception - optional
			throw new ArithmeticException("--div by zero /0--");
		}
		
		return a / b;
	}
}
