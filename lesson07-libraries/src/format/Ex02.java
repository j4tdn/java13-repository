package format;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Ex02 {
	private static final String PATTERN = "#,###.###";
	public static void main(String[] args) {
		double value = 654524.53426;
		
		System.out.println("value: " + value);
		
		DecimalFormat df = new DecimalFormat(PATTERN);
		System.out.println("df format: " + df.format(value));
		
		
	}
}
