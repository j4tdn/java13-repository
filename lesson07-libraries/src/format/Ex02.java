package format;

import java.text.DecimalFormat;

public class Ex02 {
	
	// Phần nguyên: #,### cách nhau bởi dấu phẩy >> 24,432,476,575
	// Phần thập phân: #,### cách nhau bởi dấu chấm >> 24432476575.235
	// Kết hợp: 24,432,476,575.235
	private static final String PATTERN = "#,###.###";
	
	public static void main(String[] args) {
		double value = 24432476575.2346;
		System.out.println("Value: " + value);
		
		// rounding only >> BigDecimal
		
		DecimalFormat df = new DecimalFormat(PATTERN);
		System.out.println("DecimalFormat: " + df.format(value));
	}
}
