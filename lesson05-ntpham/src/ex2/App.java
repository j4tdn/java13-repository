package ex2;

// 13đ
public class App {
	public static void main(String[] args) {
		int[] a = {3, 2, 4, 6, 5};
		System.out.println(getMissingNumber(a));
	}
	
	public static int getMissingNumber(int[] a) {
		boolean[] check = new boolean[a.length + 1];
		int index = 0;
		// vòng for a xóa đó k cần >> mặc định boolean = false rồi
		
		// Cách làm tốt ra kết quả đúng. Nhưng em có thể tham khảo cách làm
		// dưới đây để đỡ phải duyệt for
		
		// missing number = n * (n+1) / 2 - (sum of values in array)
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
