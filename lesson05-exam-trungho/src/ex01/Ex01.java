package ex01;

/**
 * <b>Description:</b> <br>
 * Có idea: 5đ
 */
public class Ex01 {

	public static void main (String[] args) {
		int a = 4;
		int b = 64;
		System.out.println(a > b ? isPowerOf(a, b) : isPowerOf(b, a));
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
//		boolean result2 = true;
//		if (b == 0)
//			result2 = false;
	 
		// A đang code bị trùng với logic phía trên
		// VD a=8, b=2 >> Tron TH này b sẽ luôn luôn != 1
		// Vì cứ lấy b = b / a thì sẽ ko bao giờ bằng 1 để break
		// dẫn đến lặp vô hạng
		// comment 
//        while (b != 1) {
//            if (b % a != 0)
//            	result2 = false;
//            b = b / a;
//        } 
        
        // return final result
        // Hơi dài
		
//        boolean finalResult;
//        if ((result1 == false) && (result2 == false)) {
//        	finalResult = false;
//        } else {
//        	finalResult = true;
//        }
//        return finalResult;
		
		return result1;
	}		
}
