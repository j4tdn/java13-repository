package format;

import java.text.DecimalFormat;

public class Ex02 {
	// Phần nguyên: #,### cách nhau phởi dấu phẩy >> 32,423,324
	// Phần thập phân: #.### cách nhau phởi dấu phẩy >> 32423324.234
	// Kết hợp >> 32,423,324.234
	// #.###,### >> error
	private static final String PATTERN = "#,###.###";

	public static void main(String[] args) {
		double value = 32423324.2345;
		System.out.println("value: " + value);

		DecimalFormat df = new DecimalFormat(PATTERN);
		System.out.println("df format: " + df.format(value));

	}
}
