package ex02;

public class App {
	public static void main(String[] args) {
		String s1 = "6b326c6e22h";
		String s2 = "6b546c6e22h";
		String[] s = {s1, s2};
		int[] max = getLargestNumbers(s);
		for(int i : max) {
			System.out.println(i);
		}

	}

	private static int[] getLargestNumbers(String[] s) {
		int[] max = new int[s.length];
		for(int k = 0; k < s.length; k++) {
			String[] digits = s[k].split("[a-z]+");
			int[] number = new int[digits.length];
			for(int i = 0; i < digits.length; i++) {
				number[i] = Integer.parseInt(digits[i]);
			}
			int m = number[0];
			for(int x:number) {
				if(m < x) {
					m = x;
					max[k] = m;
				}
			}
		}
		return max;
	}
}
