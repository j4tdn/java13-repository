package utils;

/**
 * Utility class support for calculation
 */

public class CalculationUtils {
	
	// Ko muốn khởi tạo đối tượng và Tạo cái này để ngăn cấm class khác gọi Hàm này
	private CalculationUtils() {
		
	}
	
	// Phương thức sum: không phụ thuộc vào đối tượng đang gọi
	// Utility/Helper classes (lớp tiện ích)
	// helper method
		public static int sum(int a, int b) {
			return a + b;
		}
}
