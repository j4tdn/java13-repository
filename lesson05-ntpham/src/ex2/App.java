package ex2;

public class App {
	public static void main(String[] args) {
		int[] a = {3, 2, 1, 6, 5};
		System.out.println(getMissingNumber(a));
	}
	
	public static int getMissingNumber(int[] a) {
		boolean[] check = new boolean[a.length + 1];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			check[i] = false;
		}
		for (int i = 0; i < a.length; i++) {
			check[a[i] - 1] = true;
		}
		for (int i = 0; i < a.length; i++) {
			if (!check[i]) {
				index = i;
				break;
			}
		}
		return index + 1;
	}
}
