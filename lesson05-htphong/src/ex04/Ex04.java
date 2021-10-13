package ex04;

/**
 * 17đ
 */
public class Ex04 {
	public static void main(String[] args) {
		int[] a = { 3, 15, 21, 0, 15, 17, 21 };
		int[] b = getUniqueNumbers(a);
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}

	// good way
	public static int[] getUniqueNumbers(int[] a) {
		// Complexity vẫn là O(n2) tương tự bài 2
		// VD 1 2 2 3 2
		// Thì phần tử giá trị 2 mình biết là nó đã duplicate rồi
		// Nhưng mấy giá trị 2 sau mình vẫn check lại
		int[] b = new int[a.length];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			// start
			int count = 0;
			for (int j = 0; j < a.length; j++) {
				if (a[i] == a[j])
					count++;
			}
			// end >> e có thể tách ra 1 method >> count
			if (count == 1) {
				b[k] = a[i];
				k++;
			}
		}
		
		int[] c = new int[k];
		int l = 0;
		for (int i = 0; i < c.length; i++) {
			c[i] = b[l];
			l++;
		}
		sort(c);
		return c;
	}

	public static void sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
	}
}
