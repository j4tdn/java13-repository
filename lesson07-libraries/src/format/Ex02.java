package format;

import java.text.DecimalFormat;

public class Ex02 {
	//Phần nguyên: #,### cách nhau bởi dấu phẩy 
	//Phần thập phân : #.### cách nhau bởi dấu chấm  
	//Kết hợp: #,###.###
	//error >> #.###,### 
	private static final String PATTERN = "#,###.###" ;

	public static void main(String[] args) {
		double value = 2458569324.2346;
		
		System.out.println("value: " + value);
		
		//rounding only >>BigDecimal
		
		DecimalFormat df = new DecimalFormat(PATTERN);
		System.out.println("df format: " + df.format(value));
	}
}
