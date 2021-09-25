
public class Ex03Fix {
	public static void main(String[] args) {
		int a = 123321;
		String b = "abcaba";
		System.out.println(DX(a));
		System.out.println(ichuoi(b));
	}
	
	
	private static boolean ichuoi(String s) {
		String reverse = "";
		for (int i = s.length()-1;i >=0 ;i--) {
			reverse += s.charAt(i);
		}return reverse.equals(s);
	}
	
	private static boolean DX(int n) {
		return n == soDoiXung(n);
	}
	
	private static int soDoiXung(int temp) {
		int result = 0;
		while (temp!= 0) {
			int soDX = temp % 10;
			result = result * 10 + soDX;
			temp /= 10;
		}return result;

	}
}
