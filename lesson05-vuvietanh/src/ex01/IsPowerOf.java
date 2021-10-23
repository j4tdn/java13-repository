package ex01;

// Tên class nên là 1 danh từ
// Không nên là 1 cụm động từ
// A có thể tạm đặt là Ex01 cũng được
// 10đ
public class IsPowerOf {
	public static void main(String[] args) {
		System.out.println(isPowerOf(8, 2));
	}
	private static boolean isPowerOf(int before, int after) {
		int a = 0;
		int b = 0;
		if (before > after) {
			a = before;
			b = after;
		} else {
			a = after;
			b = before;
		}
		if (a == 0 || a == 1 ) {
			return false;
		}
		// Good - Bài làm tốt
		// Có check cho cả trường hợp số thập phân
		// Nhưng có vẻ anh đọc thiếu đề
		// Như này truyền a=8, b=2 thì sẽ ra true nhưng a=2, b=8 sẽ ra false là chưa đúng
		// a=2, b=8 cũng nên bằng true
		// Em sửa lại 1 xíu ở dòng đầu tiên nha
		if (a < 1) {
			a = 1 / a;
		}
		if (b == 0 || b == 1) {
			return false;
		}
		while(a != b) {
			if (a % b != 0 ) {
				return false;
			}
			a /= b;
		}
		return true;
	}
}
