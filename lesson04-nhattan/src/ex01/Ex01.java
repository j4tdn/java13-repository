package ex01;

/**
 * Xây dựng class chứa hàm main: tạo 3 đối tượng sinh viên sv1, sv2, sv3, trong đó:
	1. sv1 chứa thông tin của chính mình (tạo bằng constructor đủ thông số, thông tin biết rồi
	khỏi nhập từ bàn phím).
	2. sv2 là thông tin người bạn thân nhất của em (tạo bằng constructor đủ thông số, thông tin
	biết rồi khỏi nhập từ bàn phím).
	3. sv3 tạo bằng constructor mặc định. Tạo hàm nhập các thông tin cho sv3 từ bàn phím sau
	đó dùng setter để gán các thuộc tính tương ứng.
	4. Viết hàm tìm thông tin sinh viên có điểm trung bình lớn hơn 8.5
	5. Viết hàm tìm thông tin sinh viên có điểm LT lớn hơn điểm TH
 */

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Student[] students = new Student[3];
		students[0] = new Student(123, "Đoàn Nhật Tân", 2, 1);
		students[1] = new Student(456, "Nguyễn Dũng", 3, 1);
		students[2] = new Student();
		inputStudent(students[2]);
		
		System.out.println("Sinh viên có điểm trung bình lớn hơn 8.5: ");
		for(Student student : students) {
			if(avgGreaterThanNumber(student, 8.5f)) {
				System.out.println(student);	
			}
		}
		
		System.out.println("Sinh viên có điểm lý thuyết lớn hơn thực hành: ");
		for(Student student : students) {
			if(lecGreaterThanLabPoint(student)) {
				System.out.println(student);
			}
		}
		
	}
	
	private static void inputStudent(Student student) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Nhập id sinh viên: ");
		student.setId(Integer.parseInt(ip.nextLine()));
		System.out.print("Nhập họ và tên: ");
		student.setFullName(ip.nextLine());
		System.out.print("Nhập điểm lý thuyết: ");
		student.setLecPoint(ip.nextFloat());
		System.out.print("Nhập điểm thực hành: ");
		student.setLabPoint(ip.nextFloat());
	}
	
	private static boolean avgGreaterThanNumber(Student student, float number){
		return (((student.getLecPoint() + student.getLecPoint()) / 2) > number);
	}
	
	private static boolean lecGreaterThanLabPoint(Student student) {
		return student.getLecPoint() > student.getLabPoint();
	}
	
}
