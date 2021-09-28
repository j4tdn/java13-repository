package bai1;

import java.util.Scanner;

public class QLSV {
	static double DiemTB(SinhVien sv) {
		return (sv.getDiemLT() + sv.getDiemTH()) / 2;
	}

	static void DTBmor(SinhVien a[]) {
		for (int i = 0; i < 3; i++) {
			if (DiemTB(a[i]) > 8.5) {
				System.out.println("Sinh vien " + (a[i]).getNameSV() + " co DTB lon hon 8.5");
			}
		}
	}

	static void Comparison(SinhVien a[]) {
		for (int i = 0; i < 3; i++) {
			if ((a[i]).getDiemLT() > (a[i]).getDiemTH()) {
				System.out.println("Sinh vien " + (a[i]).getNameSV() + " co diem ly thuyet lon hon diem thuc hanh");
			}
		}
	}

	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(01, "Tran Thi My Duyen", 7.5, 8);
		SinhVien sv2 = new SinhVien(02, "Phan Ngoc Quyen", 9.5, 9.75);
		SinhVien sv3 = new SinhVien();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin sinh vien thu 3 : ");

		System.out.println("Nhap ma sinh vien khac 1 và 2: ");
		sv3.setMSV(Integer.parseInt(sc.nextLine()));
		System.out.println("Nhap ten sinh vien: ");
		sv3.setNameSV(sc.nextLine());
		System.out.println("Nhap diem ly thuyet cua sinh vien: ");
		sv3.setDiemLT(Double.parseDouble(sc.nextLine()));
		System.out.println("Nhap diem thuc hanh cua sinh vien: ");
		sv3.setDiemTH(Double.parseDouble(sc.nextLine()));

		SinhVien a[] = { sv1, sv2, sv3 };
		System.out.println("===================================================================");
		for (int i = 0; i < 3; i++) {
			System.out.println(a[i].toString());
		}
		System.out.println("===================================================================");
		DTBmor(a);
		System.out.println("       ");
		Comparison(a);

	}
}
