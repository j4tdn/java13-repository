package format;

import java.text.DecimalFormat;

public class Ex02 {
	// phan nguyên : #,### cách nhau bởi dấu phẩy
	// phan thap phan : #.### cách nhau bởi dấu chấm 
	// error >> #.###,###
	private static final String PATTERN = "#,###.###";
	public static void main(String[] args) {
		double value = 2428322347.246;
		System.out.println("value: " + value);
		// rounding 
		DecimalFormat df = new DecimalFormat(PATTERN);
		System.out.println("df format: " + df.format(value));
	}

}
