package Exercise;

public class Ex01 {
	public static void main(String[] args) {
		String str = "aasDS12BcD172#@!";
		
		System.out.println("Count LowerCase: " + countLowerCase(str));
		System.out.println("Count UpperCase: " + countUpperCase(str));
		System.out.println("Count Digit: " + countDigit(str));
		
	}
	
	private  static int countLowerCase(String str) {
		int countlower = 0;
		for(int i = 0; i <= str.length()-1; i++) {
			char c = str.charAt(i);
			if(c >= 'a' && c <= 'z') {
				countlower++;
			}
		}
		return countlower;
	}
	
	private  static int countUpperCase(String str) {
		int countupper = 0;
		for(int i = 0; i <= str.length()-1; i++) {
			char c = str.charAt(i);
			if(c >= 'A' && c <= 'Z') {
				countupper++;
			}
		}
		return countupper;
	}
	
	private  static int countDigit(String str) {
		int countDigit = 0;
		for(int i = 0; i <= str.length()-1; i++) {
			char c = str.charAt(i);
			if(Character.isDigit(c)) {
				countDigit++;
			}
		}
		return countDigit;
	}
	
}
