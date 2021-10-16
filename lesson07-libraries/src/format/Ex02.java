package format;

import java.text.DecimalFormat;

public class Ex02 {
	
	// phan nguyen: #, ### cách nhau bởi dấu phẩy >>>2,456,567,324
	// phần thập phân: #,### cách nhau bởi dấu chấm >>> 1234567.235
	// kết hợp: #, ###.### 2,458,569,324.235
	//eror >> #.###,###
	private static final String PATTERN = "#,###.###";
	
	public static void main(String[] args) {
		double value = 24.2346;
		System.out.println("value: " + value);
		
		// rounding only >> BigDecimal
		
		DecimalFormat df = new DecimalFormat(PATTERN);
		System.out.println("df format: " + df.format(value));
	}
}
