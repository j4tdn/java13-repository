package ex02;

public class App {
	public static void main(String[] args) {
		int[] a = {3, 2, 1, 6, 5};
		System.out.println(getMissingNumber(a));
	}
	
	private static boolean isCheck(int[] a, int i) {
		
			for (int j = 0; j < a.length; j++) {
				if (i == a[j]) return true;
			}			
		return false;
	}
	private static int getMissingNumber(int[] b) {
		for (int i = 1; i < b.length + 1; i++) {
			for (int j = 0; j < b.length; j++) {
				if (!isCheck(b,i)) return i;
			}			
		}
		return 0;
	}
	
}
