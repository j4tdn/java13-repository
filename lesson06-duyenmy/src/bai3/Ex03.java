package bai3;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập gmail");
		String st = sc.nextLine();

		int n = st.indexOf("@");
		if (n == -1) {
			System.out.println(" Không hợp lệ vì thiếu @ ");
			return;
		}
		if (!(st.endsWith("@gmail.com"))) {
			System.out.println("Không hợp lệ vì đuôi sai ");
			return;
		}
		if (st.indexOf("-") == 0 || st.indexOf("-") == n - 1) {
			System.out.println(" Không hợp lệ vì dùng dấu - ");
			return;
		}
		if (st.indexOf("_") == 0 || st.indexOf("_") == n - 1) {
			System.out.println("Không hợp lệ vì dùng dấu _ ");
			return;
		}
		if (st.indexOf(".") == 0 || st.indexOf(".") == n - 1) {
			System.out.println("Không hợp lệ vì dùng dấu . ");
			return;
		}
		if (st.startsWith("..") || st.startsWith("--") || st.startsWith("__")) {
			System.out.println("Không hợp lệ vì dùng dấu .. -- __ ");
			return;
		}
		int dem = 0;
		for (int i = 0; i < n; i++) {
			dem=0;
			if (st.charAt(i) >= 'A' && st.charAt(i) <= 'Z') {
				dem++;
			} else {
				if (st.charAt(i) >= 'a' && st.charAt(i) <= 'z') {
					dem++;
				} else {
					if (st.charAt(i) >= '0' && st.charAt(i) <= '9') {
						dem++;
					} else {
						if ((st.charAt(i) == '.') || (st.charAt(i) == '-') || (st.charAt(i) == '_')) {
							dem++;
						}
					}
				}
			}
			if(dem==0) {
				System.out.println("Không hợp lệ vì chứa các kí tự không cho phép");
				return;
			}
		}

		System.out.println("Hợp lệ");
	}
}
