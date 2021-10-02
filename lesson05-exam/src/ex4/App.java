package ex4;

import java.util.Arrays;

public class App {
	public static void main(String[] args) {
		int[] a = {3, 15, 21, 0, 15, 17, 21};
		int[] b = getUniqueNumber(a);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
	
	public static void sort(int a[]) {
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[i]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
	
	public static int[] getUniqueNumber(int a[]) {
		int[] check = new int[100];
		Arrays.fill(check, 0);
		for (int i = 0; i < a.length; i++) {
			check[a[i]]++;
		}
		int n = 0;
		for (int i = 0; i < a.length; i++) {
			if (check[a[i]] == 1) n++;
		}
		int[] b = new int[n];
		int index = 0;
		for (int i = 0; i < a.length; i++) {
			if (check[a[i]] == 1) {
				b[index++] = a[i]; 
			}
		}
		sort(b);
		return b;
	}
}
