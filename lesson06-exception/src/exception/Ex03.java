package exception;

import java.io.IOException;

/**
 * Opt3: check condition and throw exception before calling function
 * throw from function and being caught(try catch) at called function
 */
public class Ex03 {
	public static void main(String[] args) {
		// a/b >> type: int, b=0;
		int a = 5;
		int b = 0;
		
		//call >> with no try/catch >> occur exception and crash app as normal
		//System.out.println(divide(a, b));
		
		try {
			System.out.println(divide(a, b));
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("message " + e.getMessage());
		}
		
		System.out.println("Back to Main method");
	}
	
	//throw
	//use: in functions, available functions 
	private static int divide(int a, int b) throws IOException /*throws ArithmeticException*/ {
		if (b == 0) {
			// first error
			// no mandatory to catch this exception - optional
			// throw new ArithmeticException("--Div by zero /0--");
			throw new IOException("--Div by zero /0--");
		}
		
		return a/b;
	}
}
