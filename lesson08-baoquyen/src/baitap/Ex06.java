package baitap;

public class Ex06 {
	public static void main(String[] args) {
		System.out.println("find number: " + findNumberAt(100));
	}
	
	private static int findNumberAt(int k) {
		int result = -1;
		String s = "";
		int i =1;
		while(s.length() < k) {
			s +=i;
			i++;
		}
		result = Integer.parseInt(String.valueOf(s.charAt(k-1)));
		return result;
	}
}
