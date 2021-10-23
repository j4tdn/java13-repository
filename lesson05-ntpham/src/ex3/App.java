package ex3;

// 18đ
public class App {
	public static void main(String[] args) {
		//int a[] = {2, 3};
		//System.out.println(getLeastCommonMutiple(a));
		int a[] = {2, 3, 4};
		System.out.println(getLeastCommonMutiple(a));
	}
	
	public static int getGreatestCommonDivisor(int a, int b) {
		if (b == 0) return a;
		return getGreatestCommonDivisor(b, a % b);
	}
	
	// tên hàm bắt đầu bằng kí tự viết thường là động từ
	public static int getLeastCommonMutiple(int a, int b) {
		return a * b / getGreatestCommonDivisor(a, b);
	}
	
	public static int getLeastCommonMutiple(int[] a) {
		// Cách làm tốt
		// Nên kiểm tra đội dài của mảng a >= 2 trước khi truy cập phần tử thứ 0, 1
		// Tránh ArrayIndexOutOfBoundException
		int temp = getLeastCommonMutiple(a[0], a[1]);
		for (int i = 2; i < a.length; i++) {
			temp = getLeastCommonMutiple(temp, a[i]);
		}
		return temp;
	}
}
