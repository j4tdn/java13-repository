package exception;

/**
 * 
 * Opt3: check condition and throw exception before calling function Throw from
 * function and being catch(try) at called function
 */
public class Ex03 {

	public static void main(String[] args) {

		int a = 5;
		int b = 0;

		// Call >> with no try/catch >> occur exception and crash app as normal
		// System.out.println(divide(a , b));

		try {
			System.out.println(divide(a, b));

		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Message: " + e.getMessage());
		}

		System.out.println("Back to Main method");
	}
	// C1 a,b (validation != 0)
	// C2 a,b (no validation) >> try catch
	// C3 a,b (no validation) >> crash app

	// Throw
	// Throw >> functions
	// Throw >> available functions
	private static int divide(int a, int b) {
		if (b == 0) {
			// Error first
			// No mandatory to catch exception - optional
			throw new ArithmeticException("Divide by Zero /  0");
		}

		System.out.println(a / b);

		return a / b;
	}
}
