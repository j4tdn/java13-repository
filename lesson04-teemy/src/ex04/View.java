package ex04;

import java.util.Scanner;

public class View {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		Manager m1 = new Manager();
		System.out.println("nhap ten: ");
		m1.name = sc.next();
		System.out.println("nhap ngay sinh: ");
		m1.birth = sc.next();
		System.out.println("nhap he so luong: ");
		m1.HSL = sc.nextFloat();
		System.out.println("nhap he so chuc vu");
		m1.hesoCV = sc.nextFloat();
		
		Clerck c1 = new Clerck();
		System.out.println("nhap ten: ");
		c1.name = sc.next();
		System.out.println("nhap ngay sinh: ");
		c1.birth = sc.next();
		System.out.println("nhap he so luong: ");
		c1.HSL = sc.nextFloat();
		System.out.println("nhap so luong nhan vien quan ly: ");
		c1.SlNvQl = sc.nextInt();
		
		Employee e1= new Employee();
		System.out.println("nhap ten: ");
		e1.name = sc.next();
		System.out.println("nhap ngay sinh: ");
		e1.birth = sc.next();
		System.out.println("nhap he so luong: ");
		e1.HSL = sc.nextFloat();
		System.out.println("nhap ten don vi: ");
		e1.nameDV = sc.next();
		
		System.out.println(m1);
		System.out.println(c1);
		System.out.println(e1);
		
		System.out.println("============================================");
		System.out.println(m1);
		System.out.println("luong = "+m1.luong());
		System.out.println(c1);
		System.out.println("luong = "+c1.luong());
		System.out.println(e1);
		System.out.println("luong = "+e1.luong());
	}
}
