package ex01;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		
		Student s1 = new Student("Minh", 1, 9.0f, 10.0f);
		Student s2 = new Student("Giang", 2, 8.8f, 8.0f);
		Student s3 = new Student();
		
		System.out.println("Nhap ten sinh vien: ");
		s3.setName(ip.nextLine());
		
		System.out.println("Nhap ID: ");
		s3.setId(ip.nextInt());
		
		System.out.println("Nhap diem LT: ");
		s3.setLTPoint(ip.nextFloat());
		
		System.out.println("Nhap diem TH: ");
		s3.setTHPoint(ip.nextFloat());
		
		Student[] student = {s1, s2, s3};
		int a;
		Boolean exit = true;
		
		do {
			System.out.println("1.Thông tin sinh viên có điểm trung bình lớn hơn 8.5");
			System.out.println("2.Thông tin sinh viên có điểm LT lớn hơn điểm TH");
			System.out.println("3.Thoat");
			System.out.println("nhap lua chon");
			a = ip.nextInt();
			switch (a) {
			case 1:
				for (Student st : student) {
					if (st.average() > 8.5) {
						System.out.println(st);
					}
				}
				break;
			case 2:
				for (Student st : student) {
					if (st.getLTPoint() > st.getTHPoint()) {
						System.out.println(st);
					}
				}
				break;
			default:
				exit = false;
				break;
			}
		}while(exit);
	}
}
