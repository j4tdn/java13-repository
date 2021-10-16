package format;

import java.text.DecimalFormat;

public class Ex02 {
	// Phần nguyên: #,### cánh nhau bởi dấu phẩy >> 2,454,367,676
	// phần phập phân : #.### cách nhau bởi đấu chấm >> 2454367676.235
	// Kết hợp : #,###.### >> 2,454,367,676.235
	// error >> #.###,###
	private static final String PATTERN = "#,###.###";
	
	public static void main(String[] args) {
		double value = 2454367676.2346;
		System.out.println("value: " + value);
		//rounding only >> BigDecimal
		
		DecimalFormat df = new DecimalFormat(PATTERN);
		System.out.println("df format: " + df.format(value));
		
	}
}
