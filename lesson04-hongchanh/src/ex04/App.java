package ex04;

import java.time.LocalDate;

public class App {
public static void main(String[] args) {
	GiamDoc nv = new GiamDoc();
	
	GiamDoc nv1 = new GiamDoc("nguyen van b", "19 1 1994", 3 ,4);
	
	TruongPhong nv2 = new TruongPhong("phan van c", "22 12 1984", 2, 5);
	
	NhanVien nv3 = new NhanVien("nguyen thi d", "31 12 1999", 1, "lao cong");
	NhanVien nv4 = new NhanVien("nguyen van e", "27 10 1999", 1, "lao cong");
	
	
	nv.setName("Tran Van a");
	nv.setHeSoLuong(3);
	nv.setDate("20 09 2021");;
	nv.setHeSoChucVu(3);
	System.out.println(nv.toString());
	System.out.println(nv1.toString());
	System.out.println(nv2.toString());
	System.out.println(nv3.toString());
	System.out.println(nv4.toString());
}
}
