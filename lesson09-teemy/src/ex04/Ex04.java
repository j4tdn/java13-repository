package ex04;

/*
 * Bài 4(20đ): Viết chương trình thực hiện chức năng đăng ký tài khoản
B1. Nhập tên tài khoản ví dụ byztkhx256
B2. Nhập mật khẩu admin123
Yêu cầu mật khẩu như sau:
1. Độ dài mật khẩu: >= 8
2. Có ít nhất 1 chữ số, 1 kí tự in hoa, và một kí tự đặc biệt (~!@#$%^&*)
3. Không được trùng quá 3 ký tự với tên tài khoản [Đăng ký khi bắt đầu chương trình]
Sau khi đã thỏa mãn yêu cầu thông báo đăng ký tài khoản thành công
 */
public class Ex04 {
	public static void main(String[] args) {
		String user = "byztkhx256";
		String pass = "admin123";
		if (pass.length() < 8) {
			System.out.println("mật khẩu không hợp lệ!");
			return;
		}
		if (!(pass.contains("[0-9]+"))) {
			System.out.println("mật khẩu không hợp lệ!");
			return;
		}
		if (!(pass.contains("[A-Z]+"))) {
			System.out.println("mật khẩu không hợp lệ!");
			return;
		}
		String[] check = { "~", "!", "@", "#", "$", "%", "^", "&", "*" };
		int checkSpe = 0;
		for (int i = 0; i < check.length; i++) {
			if ((pass.contains(check[i]))) {
				checkSpe++;
			}
		}
		if (checkSpe != 0) {
			System.out.println("mật khẩu không hợp lệ!");
			return;
		}

		int checkUser = 0;
		for (int i = 0; i < pass.length(); i++) {
			for (int j = 0; j < user.length(); j++) {
				if (pass.charAt(i) == user.charAt(j)) {
					checkUser++;
					break;
				}
			}
		}
		if (checkUser > 3) {
			System.out.println("mật khẩu không hợp lệ!");
			return;
		}
		System.out.println("đăng ký tài khoản thành công");

	}
}
