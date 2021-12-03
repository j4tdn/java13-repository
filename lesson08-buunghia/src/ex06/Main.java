package ex06;

public class Main {
	public static void main(String[] args) {
		System.out.println(numberAt(100));
	}
	public static int numberAt(int k) {
		String s="";
		int i = 1;
		while(s.length()<k) {
			s += i;
			i++;
		}
		return Integer.parseInt(String.valueOf(s.charAt(k-1)));
		
	}
}
