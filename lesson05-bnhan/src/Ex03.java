
import java.util.Random;

/**
 * Nhớ format code
 * 16
 */
public class Ex03 {
	private static Random rd = new Random();

	public static void main(String[] args) {
		// Chú ý cách đặt tên biến dễ hiểu
		// Sau có người review code cũng dễ đọc
		int x = 1;
		int n = rd.nextInt(3) + 2;
		int[] arr = new int[n];
		randomArray(arr);
		showArray(arr);

		
		// Đỡ phải check quá nhiều lần như bên dưới
		if (arr.length >= 2) {
			x = getLCM(arr[0], arr[1]);
		}
		
		for (int i = 2; i < n; i++) {
			// Như này cũng tốt. Nhưng phải check đi check lại đoạn i == 0 và i == 1 n lần
			// if (i == 0 || i == 1)
				// x = getLCM(arr[0], arr[1]);
			// else {
				x = getLCM(x, arr[i]);
			// }
		}

		System.out.println("LCM:" + x);

	}

	public static void randomArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rd.nextInt(10) + 1;
		}
	}

	public static void showArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + ",");
		}
		System.out.println(arr[arr.length - 1] + "]");
	}

	public static int getLCM(int a, int b) {
		int n = 1;
		// Cách này kiểu là cứ cho chạy n = 1 mãi đến khi n chia hết cho a và b thì dừng
		// Code sẽ chạy dc nhưng hơi chuối
		while (n % a != 0 || n % b != 0)
			n++;
		return n;
	}
}
