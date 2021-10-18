package view;
/*
 * Bài 4: Viết phương thức readNumer (đọc số sang chữ đối với các số có tối đa 
 * 3 chữ số),  phương thức nhận vào 1 tham số thuộc kiểu int (có tối đa 3 chữ 
 * số), trả về chuỗi (String) cho  biết cách đọc số n ra dạng chữ: 

 */

import java.util.Scanner;

public class Ex04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap n");
		int n = sc.nextInt();

		int[] a = { 0, 0, 0, 0, 0 };
		int i = 1;
		while (n != 0) {
			a[i] = n % 10;
			n = n / 10;
			i++;
		}

		for (int j = i - 1; j > 0; j--) {
			System.out.println(a[j]);
		}
		for (int j = i - 1; j > 0; j--) {
			ReadNumber(a[j], a[j - 1], a[j + 1], j);
			ReadUnit(j, a[j]);
		}
	}

	private static void ReadUnit(int i, int truoc) {
		if (i == 3) {
			System.out.print("trăm ");
			return;
		}
		if (i == 2) {
			if (truoc == 1 || truoc == 0) {
				return;
			}
			System.out.print("mươi ");
			return;
		}
		if (i == 1) {
			return;
		}

	}

	private static void ReadNumber(int a, int sau, int truoc, int vt) {
		if (a == 0) {
			if (truoc != 0&& vt == 2) {
				System.out.print("linh ");
				return;
			}
			if (truoc == 1 || truoc == 0 || vt == 1) {
				return;
			}
			if (truoc != 0) {
				System.out.print("linh ");
				return;
			}
			System.out.print("không ");
			return;
		}
		if (a == 1) {

			if (vt == 2) {
				System.out.print("mười");
				return;
			}
			if (truoc != 0) {
				System.out.print("mốt ");
				return;
			}
			System.out.print("một ");
			return;
		}
		if (a == 2) {
			System.out.print("hai ");
			return;
		}
		if (a == 3) {
			System.out.print("ba ");
			return;
		}
		if (a == 4) {
			System.out.print("bốn ");
			return;
		}
		if (a == 5) {
			if (truoc != 0) {
				System.out.print("lăm ");
				return;
			}
			System.out.print("năm ");
			return;
		}
		if (a == 6) {
			System.out.print("sáu ");
			return;
		}
		if (a == 7) {
			System.out.print("bảy ");
			return;
		}
		if (a == 8) {
			System.out.print("tám ");
			return;
		}
		if (a == 9) {
			System.out.print("chín ");
			return;
		}

	}

}
