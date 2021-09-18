package bean;

/**
 * 
 * Utility class supports for calculation
 *
 */

public class CalculationUntils {
	
	// Không cho tạo object từ class
	private CalculationUntils() {
		
	}
	
	
	// Phương thức sum : không phụ thuộc vào đối tượng đang gọi
	// Utility, Helper classes
	// Helper methods
	public static int sum (int a, int b) {
		return a + b;
	}
}
