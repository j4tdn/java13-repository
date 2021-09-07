package lesson02;

public class Ex05 {
	public static void main(String[] args) {
		int input = 2;
		chuyenDoi(input);
	}
	private static void chuyenDoi(int input) {
		int[] a = new int[100];
		int i = 0;
		while(input > 0) {
			a[i] = input % 2;
			input /= 2;
			i++;
		}
		for (int j = i-1; j >= 0;j--) {
			System.out.print(a[j]);
		}
	}
}
