package format;

import java.text.DecimalFormat;

public class Ex02 {
	private static final String PATTERN = "#,###"; 
	
	public static void main(String[] args) {
		double value = 24.2346;
		
		DecimalFormat df = new DecimalFormat(PATTERN);
		System.out.println("df" + df.format(value));
		System.out.println("value: " + value);
	}
}
