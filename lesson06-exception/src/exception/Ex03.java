package exception;

/**
 * Otp3: check condition and throw exception before calling function
 * throw from function and being caught (try) at called function
 */

public class Ex03 {
	public static void main(String[] args) {
		// a/b >> type: int, b=0
		int a = 5; 
		int b = 0;
		
		// CALL >> with no try/catch >> occur exception and crash app as normal
		// System.out.println(devide (a, b));
		
		try {
			System.out.println(devide (a, b));
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("message " + e.getMessage());
		}
		
		// Throws >> no mandatory
		
		System.out.println("Back to MAIN method");
		
	}

	// THROW
	// throw >> functions (use 'throw' in functions)
	// throw >> available function
	private static int devide(int a, int b) /*throws ArithmeticException */ {
		if (b == 0) {
			// error first
			// no mandatory to catch this exception - optional
			// Throwable#detailMessage (Class Throwable; Attribute: detailMessage)
			throw new ArithmeticException("--div by zero /0--"); // If Exception => Stop here, donot run below code
		}
		
		return a / b;
	}
}