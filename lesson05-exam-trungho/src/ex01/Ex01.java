package ex01;

/**
 * <b>Description:</b> <br>
 */
public class Ex01 {

	public static void main (String[] args) {
		System.out.println(isPowerOf(8, 2));
		System.out.println(isPowerOf(2, 8));
		System.out.println(isPowerOf(6, 2));
		System.out.println(isPowerOf(20, 4));
		System.out.println(isPowerOf(64, 4));
	}
	
	/**
	 * <b>Description:</b> Check if a is power of b or not and vice versa<br>
	 * <b>Return:</b> True if a is power of b and vice versa, otherwise, return False<br>
	 * @param a, b
	 */
	public static boolean isPowerOf(int a, int b) {
		
		// Check if a is power of b
		boolean result1 = true;
		if (a == 0)
			result1 = false;
	 
        while (a != 1) {
            if (a % b != 0)
            	result1 = false;
            a = a / b;
        } 
        
        // Check if b is power of a
		boolean result2 = true;
		if (b == 0)
			result2 = false;
	 
        while (b != 1) {
            if (b % a != 0)
            	result2 = false;
            b = b / a;
        } 
        
        // return final result
        boolean finalResult;
        if ((result1 == false) && (result2 == false)) {
        	finalResult = false;
        } else {
        	finalResult = true;
        }
        return finalResult;
	}		
}
