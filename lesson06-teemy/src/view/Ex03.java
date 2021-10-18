package view;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap mail");
		String st = sc.nextLine();

		int n = st.indexOf("@");
		if (n == -1) {
			System.out.println("Ko co @ -> Khong hop le ");
			return;
		}
		if (!(st.endsWith("@mail.com"))) {
			System.out.println("duoi sai -> khong hop le ");
			return;
		}
		if (st.indexOf("-") == 0 || st.indexOf("-") == n - 1) {
			System.out.println("-dung dau hoac dung truoc @ -> khong hop le ");
			return;
		}
		if (st.indexOf("_") == 0 || st.indexOf("_") == n - 1) {
			System.out.println("_dung dau hoac dung truoc @ -> khong hop le ");
			return;
		}
		if (st.indexOf(".") == 0 || st.indexOf(".") == n - 1) {
			System.out.println(".dung dau hoac dung truoc @ -> khong hop le ");
			return;
		}
		if (st.startsWith("..") || st.startsWith("--") || st.startsWith("__")) {
			System.out.println("-- hoac __ hoac .. -> khong hop le ");
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
				System.out.println("chua cac ky tu ko cho phep -> khong hop le");
				return;
			}
		}

		System.out.println("Hop le");
	}
}
