package format;

import java.text.DecimalFormat;

public class Ex02 {
	
	// Phần nguyên: #,### cách nhau bởi dấu phẩy    >>  2,458,569,324
	// Phần thập phân: #.### cách nhau bởi dấu chấm >>  2458569324.235
	// Kết hợp: #,###.### 2,458,569,324.235
	// error >> #.###,###
	private static final String PATTERN = "#,###.###";
	
	public static void main(String[] args) {
		double value = 2458569324.2346;
		System.out.println("value: " + value);
		
		// rounding only >> BigDecimal
		
		DecimalFormat df = new DecimalFormat(PATTERN);
		System.out.println("df format: " + df.format(value));
	}
}
