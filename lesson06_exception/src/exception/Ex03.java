package exception;

/*
 * Opt 3: check condition and throw exception before calling function
 * throw from function and being catch(try) at called function
 */
public class Ex03 {
	public static void main(String[] args) {
		// a/b >> type int, b = 0
		int a = 5; 
		int b = 0;
		// call >> with no try catch >> occur exception and crash app as normal
		try {
			System.out.println(divide(a, b));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Message: " + e.getMessage() );
		}
		
		System.out.println("Back to MAIN method");
	}
	
	// C1: a, b (validation != 0)
	// c2: a,b (no validation) >> try catch
	// c3: a,b(no validation) >> crash application
	
	private static int divide(int a, int b) throws Exception {
		if (b == 0) {
			// Error first
			// no mandatory to catch exception - optional 
			throw new Exception("--- div by zero ---");
		}
		return a/b;
	}
	
}
