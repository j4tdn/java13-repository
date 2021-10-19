package bai4;

import java.util.Scanner;

public class Ex04 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int k;
		while (true) {
			try {
				System.out.println("Nhap so k: ");
				k = Integer.parseInt(sc.nextLine());
				while (k > 999 || k < 0) {
					System.out.println("Hay nhap n trong khoang qui dinh!!");
					k = Integer.parseInt(sc.nextLine());
				}
				docSo(k);
				break;
			} catch (Exception e) {
				System.out.println("Loi!! Hay nhap n là mot so trong khoang qui dinh!!! ");
			}

		}
	}

	private static void docSo(int k) {
		int i = 0;
		int[] a = { 0, 0, 0 };
		while (k != 0) {
			a[i] = k % 10;
			k = k / 10;
			i++;
		}
		if (i == 1)
			motchuso(a);
		if (i == 2)
			haichuso(a);
		if (i == 3)
			bachuso(a);
	}

	private static void motchuso(int[] a) {
		int m = a[0];
		if (m == 0) {
			System.out.print("không");
		}
		if (m == 1) {
			System.out.print("một");
		}
		if (m == 2) {
			System.out.print("hai");
		}
		if (m == 3) {
			System.out.print("ba");
		}
		if (m == 4) {
			System.out.print("bốn");
		}
		if (m == 5) {
			System.out.print("năm");
		}
		if (m == 6) {
			System.out.print("sáu");
		}
		if (m == 7) {
			System.out.print("bảy");
		}
		if (m == 8) {
			System.out.print("tám");
		}
		if (m == 9) {
			System.out.print("chín");
		}
	}

	private static void haichuso(int[] a) {
		int[] m = { 0 };
		int[] n = { 0 };
		m[0] = a[1];
		n[0] = a[0];
		if (m[0] == 0) {
			motchuso(n);
		} else {
			if (m[0] == 1) {
				if (n[0] == 0) {
					System.out.println("mười ");
				} else {
					if (n[0] != 5) {
						System.out.print("mười ");
						motchuso(n);
					} else {
						System.out.println("mười lăm");
					}

				}
			} else {
				if (n[0] == 0) {
					motchuso(m);
					System.out.print(" mươi ");
				} else {
					if (n[0] == 1) {
						motchuso(m);
						System.out.print(" mươi mốt");

					} else {
						if (n[0] == 5) {
							motchuso(m);
							System.out.print(" mươi lăm");
						} else {
							motchuso(m);
							System.out.print(" mươi ");
							motchuso(n);
						}
					}
				}
			}
		}
	}

	private static void bachuso(int[] a) {
		int[] m = { 0 };
		int[] n = { 0 };
		int[] p = {0};
		int[] mn= {0,0};
		p[0]=a[2];
		m[0] = a[1];
		n[0] = a[0];
		mn[0]=a[0];
		mn[1]=a[1];
		
		if(p[0]==0) {
			haichuso(mn);
		}else {if(m[0]==0) {
			if(n[0]==0) {
				motchuso(p);
				System.out.print(" trăm");
			}else {
				motchuso(m);
				System.out.print(" linh ");
				motchuso(n);
			}
			}else {
				motchuso(p);
				System.out.print(" trăm ");
				haichuso(mn);
			}
		}
	}
}
