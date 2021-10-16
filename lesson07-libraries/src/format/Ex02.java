package format;

import java.text.DecimalFormat;
	
public class Ex02 {
	// Phần nguyên: #,### cách nhau bởi dấu phẩy >> 2,545,342,242
	// Phần thập phân: #.### cách nhau bởi dấu chấm >> 24324124.343
	// Phần kết hợp: #,###.### >> 242,242,123.231
	private static final String PATTERN = "#,###.00";
	
	public static void main(String[] args) {
		double value = 212314.295;
		
		System.out.println("value: " + value);
		
		DecimalFormat df = new DecimalFormat(PATTERN);
		System.out.println("df format: " + df.format(value));
	}
}
