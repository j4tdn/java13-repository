package exception;

import java.io.IOException;

/**
 * Opt3: check condition and throw exception before calling function throw from
 * function and being catch(try) at called function
 */
public class Ex03 {
	public static void main(String[] args) {
		// a/b >> type: int, b=0
		int a = 5;
		int b = 0;

		// call >> with no try/catch >> occur exception and crash app as normal
		// System.out.println(devide(a, b));

		try {
			System.out.println(devide(a, b));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("message " + e.getMessage());
		}
		
		// throws >> still no mandatory
		// devide(a, b);

		System.out.println("Back to MAIN method");
	}

	// C1: a,b(validation != 0)
	// C2: a,b(no validation) >> try catch
	// C3: a,b(no validation) >> crash application

	// throw
	// throw >> functions
	// throw >> available functions
	private static int devide(int a, int b) throws IOException /*throws ArithmeticException*/ {
		if (b == 0) {
			// error first
			// no mandatory to catch this exception - optional
			// Throwable#detailMessage
			// throw new ArithmeticException("--div by zero /0--");
			throw new IOException("--div by zero /0--");
		}

		return a / b;
	}
}
