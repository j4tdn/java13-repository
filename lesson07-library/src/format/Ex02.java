package format;

import java.text.DecimalFormat;


public class Ex02 {
	//"#,###":247,243,435
	//"#.###":247243435.235
	//"#.000000":247243435.234600
	//"#,###.###":247,243,435.235
	//"#.###,###": loi 
	private static final String PATTERN ="#,###.###";
	
	public static void main(String[] args) {
		double value = 247243435.2346;
		
		//rounding only >>BigDecimal
		
		DecimalFormat df = new DecimalFormat(PATTERN);
		System.out.println("df format: "+df.format(value));
		
	}
}
