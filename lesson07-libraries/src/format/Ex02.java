package format;

import java.text.DecimalFormat;

public class Ex02 {
	
	private static final String PATTERN = "#,###.###";
	
	// Integer part: #,### separated by commas >> 2,432,145
	// Decimal part: #.### separated by dot >> 	2432145.235
	// Combine: #,###.### 2,432,145.235
	// Error >> #.###,###
	public static void main(String[] args) {
		double value = 2432145.2346;
		System.out.println("value: " + value);
		
		// rounding only >> BigDecimal
		
		DecimalFormat df = new DecimalFormat(PATTERN);	
		System.out.println("df format: " + df.format(value));
	}
}
