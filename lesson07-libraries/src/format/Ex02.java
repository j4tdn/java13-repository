package format;

import java.text.DecimalFormat;

public class Ex02 {
	
	// Phần nguyên: #,### cách nhau bởi dấu phẩy >> 243,456,433
	// Phần thập phân: #.### cách nhau bởi dấu chấm >> 243456433.235
	// Kết hợp: 
	private static final String PATTERN = "#,###.###"; // EX: phần thập phân "2346" > dấu # tương ứng với từng số, không có số thì ko hiển thị phần đó. 
			
	public static void main(String[] args) {
		double value = 243456433.2346;
			
		// only rounding >> use BigDecimal
		
		DecimalFormat df = new DecimalFormat(PATTERN);	
		System.out.println("df format: " + df.format(value));
		
		
	}

}
