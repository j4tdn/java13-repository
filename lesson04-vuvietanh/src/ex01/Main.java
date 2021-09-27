package ex01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student sv1 = new Student(124,"Vũ Việt Anh", 8.5f, 8.8f);
		Student sv2 = new Student(194,"Hoàng Nguyên", 8.7f, 9.1f);
		
		Student sv3 = new Student();
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập mã sinh viên 3: ");
		sv3.setMaSV(Integer.parseInt(ip.nextLine()));
		System.out.print("Nhập tên sinh viên 3: ");
		sv3.setName(ip.nextLine());
		System.out.print("Nhập điểm LT sinh viên 3: ");
		sv3.setDiemLT(ip.nextFloat());;
		System.out.print("Nhập điểm TH sinh viên 3: ");
		sv3.setDiemTH(ip.nextFloat());
		
		System.out.println("MãSV\tTên Sinh Viên\tĐiểm LT\tĐiểm TH\tĐiểm TB ");
		System.out.println("==============================================================================");
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
		
	}
}
