package ex01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Student sv1 = new Student(1,"Tra My",10,8);
		Student sv2 = new Student(2,"My Duyen",9,9);
		Student sv3 = new Student();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap id cua sv3: ");
		sv3.setId(sc.nextInt());
		System.out.println("nhap ten cua sv3: ");
		sv3.setName(sc.next());
		System.out.println("nhap diem ly thuyet cua sv3: ");
		sv3.setDLT(sc.nextFloat());
		System.out.println("nhap diem thuc hanh cua sv3: ");
		sv3.setDTH(sc.nextFloat());
		
		checkDTB(sv1, sv2, sv3);
		
		System.out.println("============================================");
		
		checkDLTDTH(sv1, sv2, sv3);
			
	}
	public static void checkDTB(Student s1,Student s2, Student s3) {
		System.out.println("thong tin sv co diem trung binh >8.5");
		if(s1.DTB(s1.getDLT(), s1.getDTH())>8.5) {
			System.out.println(s1);
		}
		if(s2.DTB(s2.getDLT(), s2.getDTH())>8.5) {
			System.out.println(s2);
		}
		if(s3.DTB(s3.getDLT(), s3.getDTH())>8.5) {
			System.out.println(s3);
		}
	}
	
	public static void checkDLTDTH(Student s1,Student s2, Student s3) {
		System.out.println("thong tin sinh vien co diem ly thuyet lon hown diem trung binh");
		if(s1.getDLT()>s1.getDTH()) {
			System.out.println(s1);
		}
		if(s2.getDLT()>s2.getDTH()) {
			System.out.println(s1);
		}
		if(s3.getDLT()>s3.getDTH()) {
			System.out.println(s1);
		}
	}
}
