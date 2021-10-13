package exception;

/**
 * Opt 3: check condition and throw exception before calling function
 * throw from function and being catch(try) at called function
 */
public class Ex03 {
	public static void main(String[] args) {
		//a/b >> type : int, b = 0;
		int a = 5;
		int b = 0;
		
		//call >> with no try/catch >> occur exception and crash app as normal
		//System.out.println(devide(a, b));
		
		try {
			System.out.println(devide(a, b));
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Message " + e.getMessage());
		}
	
		System.out.println(" Back to MAIN method ");
	}
	
	//throw
	//Thường dùng throw trong những function tự viết ra hoặc hàm của JAVA
	//Throwable#detailMessage
	private static int devide(int a, int b)throws Exception {
		
		if(b == 0) {
			//error first
			//no mandatory to catch this exception - optional
			//throw new ArithmeticException("--div by zero / 0--");
			throw new Exception("--div by zero / 0--");
		}
		return a/b;
	}
	
}
