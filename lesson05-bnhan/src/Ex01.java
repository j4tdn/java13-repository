import java.util.Scanner;

/**
 * Đúng 50% yêu cầu. Và sai convention
 * 8đ
 */
public class Ex01 {
	private static final Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// Có thể truyền trực tiếp ko cần nhập suất mất thời gian
		System.out.print("Nhap a ");
		int a = sc.nextInt();
		
		// Chưa chắc user đã nhập b nhỏ hơn a
		// Khi đó bài toán sẽ sai
		System.out.print("Nhap b");
		int b = sc.nextInt();
		
		// Cứ cho nhập a, b thoải mái rồi sửa lại như này thử xem
		boolean isPowerOf = a > b ? isPowerOf(a, b) : isPowerOf(b, a);
		System.out.println(isPowerOf + ".....");

	}

	// Hạn chế method return void. Như kiểu mình viết api, service
	// phải trả về value cụ thể
	// Đặt tên hàm có ý nghĩa
	public static boolean isPowerOf(int a, int b) {
		while (a % b == 0) {
			a = a / b;
		}
		return a == 1;
	}

}
