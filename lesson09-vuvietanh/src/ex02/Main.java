package ex02;

public class Main {
	public static void main(String[] args) {
		String regex = "[a-z]+";
		String s1 = "01a2b3456cde478";
		String s2 = "1a6b326c6e22h";
		
		String[] n1 = s1.split(regex);
		String[] n2 = s2.split(regex);
		
		int [] result1 = detached(n1);
		int [] result2 = detached(n2);
		
		int max1 = maxNum(result1);
		int max2 = maxNum(result2);
		
		if (max1 > max2) {
			System.out.println(max2 + " -->" + max1);
		}else
		System.out.println(max1 + " -->" + max2);
		
	}
	public static int[] detached(String[] num) {
		int[] numberToInt = new int[num.length];
		int index = 0;
		for (String n: num) {
			numberToInt[index++] = Integer.parseInt(n);
		}
		
		return numberToInt;
	}
	private static int maxNum(int [] n) {
		int max = n[0];
		for(int i = 0; i < n.length;i++) {
			if(max < n[i]) {
				max = n[i];
			}
		}
		return max;
	}
	
	
}
