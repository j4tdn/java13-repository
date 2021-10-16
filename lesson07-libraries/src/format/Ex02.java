package format;

import java.text.DecimalFormat;

public class Ex02 {
	
	// Phần nguyên: #,### cách nhau bởi dấu phẩy.
	// Phần thập phân: #.### cách nhau bởi dấu chấm >> 2356727.245
	// Kết hợp: #,###.###
	// error >> #.###,###
	private static final String PATTERN = "#,###.###";

	public static void main(String[] args) {
		double value = 5624.2346666;

		System.out.println("value: " + value);
		// rounding >> BigDecimal
		
		DecimalFormat df = new DecimalFormat(PATTERN);
		System.out.println("df format: " + df.format(value));
	}
}
