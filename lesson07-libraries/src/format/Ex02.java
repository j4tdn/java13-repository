package format;

import java.text.DecimalFormat;

public class Ex02 {
	private static final String PATTERN="#,###.###";
public static void main(String[] args) {
	double value = 5693288774.2346;
	System.out.println("value: "+value);
	//rounding only >>BigDecimal
	
	DecimalFormat df = new DecimalFormat(PATTERN);
	System.out.println("df format: "+df.format(value));
}
}
