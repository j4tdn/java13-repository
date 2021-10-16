package format;

import java.text.DecimalFormat;

public class Ex02 {
	
	// Phần nguyên: #,### cách nhau bởi dấu phẩy	>>	2,412,342
	// Phần thập phân: #.### cách nhau bởi dấu chấm >> 2412342.235
	// Kết hợp: #,###.### 2,412,342.235
	// error >> #.###,###
	private static final String PATTERN = "#,###.###";
	
	public static void main(String[] args) {
		double value = 2412342.2346;
		
		// rounding only >> BigDecimal
		
		DecimalFormat df = new DecimalFormat(PATTERN);
		System.out.println("df format: " + df.format(value));
		
	}
}
