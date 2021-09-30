package ex01;

import java.util.Scanner;

public class App {
public static void main(String[] args) {
		
		Student sv1 = new Student(1,"Nguyen Hong Chanh", 10, 9);
		
		Student sv2 = new Student(2, "bo sua ", 6,6);
		
		Student sv3 = nhapSV3();
		
		System.out.println(sv1.toString());
		System.out.println(sv2.toString());
		System.out.println(sv3.toString());
		System.out.println("============================================");
		
		Student st[] = new Student[3];
		
		st[0]= sv1;
		st[1]= sv2;
		st[2]= sv3;
		
		diemTBlonnhat(st);
		
		check(st);
		
		
		
		
	}

	public static void diemTBlonnhat(Student a[]) {
		double max=8.5;
		
		System.out.println("hoc sinh co diem TB cao hon 8.5");
		for (int i=0; i< a.length; i++) {
			if(a[i].calDiemTB() > max ) {
				System.out.println(a[i].toString());
			}
		}
		System.out.println("============================================");
	}
	
	public static void check(Student a[]) {
		
		System.out.println("hoc sinh co diem LT cao hon diem TH");
		for (int i=0; i< a.length; i++) {
			if(a[i].getDiemLT() > a[i].getDiemTH()) {
				System.out.println(a[i].toString());
			}
		}
		System.out.println("============================================");
	}
	
	
	public static Student nhapSV3() {
		
		Student sv3 = new Student();
		
		System.out.print("Moi nhap id : ");		
		sv3.setId(new Scanner(System.in).nextInt());
		
		System.out.print("Moi nhap ten : ");
		sv3.setName(new Scanner(System.in).nextLine());
		
		System.out.print("Nhap diem LT : ");
		sv3.setDiemLT(new Scanner(System.in).nextFloat());
		
		System.out.print("Nhap diem TH : ");
		sv3.setDiemTH(new Scanner(System.in).nextFloat());
		
		
		
		
		return sv3;
		
		
	}
}
