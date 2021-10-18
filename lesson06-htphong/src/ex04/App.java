package ex04;
/*
 * Bai 4: doc so sang chu
 * */
public class App {
	public static void main(String[] args) {
		try {
			System.out.println("Result: " + readNumber(101));
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private static String readNumber(int number) {
		if(number <= 0 || number > 999) {
			throw new ArithmeticException("Error >> Number > 999 or number < -999");
		}
		
		String result = "";
		String[] units1 = {"", "Một", "Hai", "Ba", "Bốn", "Năm", "Sáu", "Bảy", "Tám", "Chín"};
		String[] dozens = {"Lẻ", "Mười", "Hai Mươi", "Ba Mươi", "Bốn Mươi", "Năm Mươi", "Sáu Mươi", "Bảy Mươi", "Tám Mươi", "Chín Mươi"};
		String[] hundreds = {"", "Một Trăm", "Hai Trăm", "Ba Trăm", "Bốn Trăm", "Năm Trăm", "Sáu Trăm", "Bảy Trăm", "Tám Trăm", "Chín Trăm"};
		int unit = number % 10;
		int dozen = number / 10 % 10;
		int hundred = number / 100;
		result = result + hundreds[hundred] ;
		if (dozen == 0 && unit == 0 ) return result;
		
		if(dozen>0 && (unit == 1 || unit == 5)) {
			if(unit == 1) {
				result = result + " " + dozens[dozen] + " " + "Mốt";
			}
			else result = result + " " + dozens[dozen] + " " + "Lăm";
			
		}
		else {
			if (dozen == 0 && hundred == 0){
				result = result + units1[unit];
			}
			else result = result + " " + dozens[dozen] + " " + units1[unit];
		}
		
		
		
		return result;
	}
}
