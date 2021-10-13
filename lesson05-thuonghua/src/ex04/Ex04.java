package ex04;

/**
 * 16đ
 */
public class Ex04 {

	public static void main(String[] args) {
		int[] array = { 1, 1, 2, 2, 3, 4, 5, 6, 6 };

		System.out.print("Các phần tử xuất hiện 1 lần trong mảng là: ");
		for (int i = 0; i < array.length; i++) {
			// Tham số array.length hơi thừa
			// complexity chưa tốt
			// VD phần tử 6 cuối cùng. Như trước đó mình thấy 6 đã là duplicate element
			// nhưng qua 6 cuối cùng mình cũng phải check lại
			// Em nên tạo 1 cái flag chi đó để biết những giá trị nào mình đã mark duplicated
			if (getUniqueNumbers(array, array.length, array[i]) == 1)
				System.out.print("[ " + array[i] + " ]");
		}
	}

	// hàm này là em đang đếm số lần xuất hiện phần tử i trong mảng a
	// ko phải getUniqueNumbers >> tên hàm thiếu nghĩa
	public static int getUniqueNumbers(int a[], int n, int i) {
		int count = 0;
		for (int j = 0; j < n; j++) {
			if (a[j] == i)
				count++;
		}
		return (count);
	}
}
