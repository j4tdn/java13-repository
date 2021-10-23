package ex4;

import java.util.Arrays;

// 17đ
public class App {
	public static void main(String[] args) {
		int[] a = {3, 15, 21, 0, 15, 17, 21};
		// Cách em làm có 1 cái chưa tốt đó là
		// VD a[1]=15 e đã kiểm tra và biết đó là duplicate value
		// Nhưng sau đó a[4]=15 e lại phải kiểm tra giá trị đó lại 1 lần nữa
		// Hơi duplicate code
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
		// Bước này bị thừa. Mặc định int value = 0 rồi
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
		// good
		for (int i = 0; i < a.length; i++) {
			if (check[a[i]] == 1) {
				b[index++] = a[i]; 
			}
		}
		sort(b);
		return b;
	}
}
