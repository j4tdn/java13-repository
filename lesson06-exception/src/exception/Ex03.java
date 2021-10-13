package exception;
/*
 * Opt 3: check condition and throw exception before calling function
 * throw from function and being catch at called function
 */
public class Ex03 {
	public static void main(String[] args) {
		// a/b >> type: int, b = 0
		int a = 5; 
		int b = 0;
		
		// catch, call
		// call >> with no try/catch >> occur exception and crash app as normal
		//System.out.println(divide(a,b));
		try {
			System.out.println(divide(a,b));
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("message " + e.getMessage());
		}
		// throws >> still 
		System.out.println("Back to MAIN method");
	}
	
	// throw
	// throw >> function
	// throw >> available functions
	// Throwable#detailMessage
	private static int divide(int a, int b) /*throws ArithmeticException*/ {
		if(b == 0) {
			// error first
			// no mandatory to catch this exception - optional
			throw new ArithmeticException("-- div by zero /0 --");
		}
		return a/b;
	}
}
