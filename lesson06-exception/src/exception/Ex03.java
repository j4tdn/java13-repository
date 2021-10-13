package exception;

/**
 * 
 * Opt3: check condition and throw exception before calling function
 * throw from function and being catch(try) at called function
 */
public class Ex03 {
	public static void main(String[] args) {
		// a/b >>type : int, b=0
		int  a = 5; 
		int b = 0;

		
		// call >> with no try/catch >> occur exception and crash app as normal
		//System.out.println(devide(a, b));
		
		try {
			System.out.println(devide(a, b));
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("massage: " + e.getMessage());
		}
		System.out.println("Back to MAIN method");
	}
	// c1: a,b(validation != 0)
	// c2:  a,b(no validation)>> try catch
	// c3: a,b(no validation)>> crash application
	
	// throw
	// throw 
	private static int devide( int a , int b) {
		if (b==0) {
			// error first
			// no mandatory to catch exception - optional
			throw new ArithmeticException("--div by zero/0 --");
		}
	 return a/b;
	}

}
