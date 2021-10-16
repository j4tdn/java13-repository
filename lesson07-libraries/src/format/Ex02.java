package format;

import java.text.DecimalFormat;

public class Ex02 {
	
	// Phaàn nguyên : #,### cách nhau bởi dấu phẩy
	// phần thập phân: #.### cách nhau bởi dấu chấm
	private static final String PATTERN = "#,###.###";
	public static void main(String[] args) {
		double value = 56526524.151;
		
		System.out.println("value: " + value);
		
		DecimalFormat df = new DecimalFormat(PATTERN);
		System.out.println("df format: " + df.format(value));
		
	}
}
