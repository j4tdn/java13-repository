package ex02;

public class App {
	public static void main(String[] args) {
		int n = 2;
		String[] c = {"aa6b546c6e22h","aa6b326c6e22h"};
		System.out.println("Largest Number: ");
		showArray(getLargestNumbers(c));
	}
	private static String[] getLargestNumbers(String[] c) {
		String[] result = new String[c.length];
		int k = -1;
		for(int i = 0; i<c.length; i++) {
			String[] s = cutString(c[i]);
			int max=0;
			for(int j = 0;j<s.length; j++) {
				if(s[j]!="") {
					int num = Integer.parseInt(s[j].toString());
					if(num>max) max = num;
				}
			}
			k++;
			result[k] = max+""; 
		}
		return result;
	}
	private static String[] cutString(String s) {
		return s.split("[A-Za-z]+");
	}
	
	private static void showArray(String[] c) {
		for(int i = 0;i <c.length;i++) {
			if(i == c.length-1) {
				System.out.print(c[i]);
			}
			else System.out.print(c[i] + ", ");
		}
	}
}
