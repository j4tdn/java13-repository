package ex04;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Viết chương trình quản lý nhân sự tại công ty A
 * + Giám đốc: họ tên, ngày sinh, hệ số lương, hệ số chức vụ
 * + Trưởng phòng: họ tên, ngày sinh, hệ số lương, số lg nhân viên quản lý
 * + Nhân viên: họ tên, ngày sinh, hệ số lương, tên đơn vị (phòng/ban)
 * Yêu cầu:
 * + Nhập dữ liệu gồm 1 GĐ, 1 TP, 2 NV
 * + Hiển thị thông tin các nhân sự 
 * + Tính và in ra mức lương cho từng loại nhân sự
 */

public class App {
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		Director d = new Director("Tran Thuy Van", LocalDate.parse("21/05/1997", dtf), 3.0, 1.0);
		Manager m = new Manager("Tran Van B", LocalDate.parse("20/04/1992", dtf), 2.0, 100);
		Employee e1 = new Employee("Nguyen Thi C", LocalDate.parse("30/08/1994", dtf), 0.5, "Business");
		Employee e2 = new Employee("Ho Van Minh", LocalDate.parse("02/02/1990", dtf), 0.7, "IT");
		
		System.out.println("Information: ");
		System.out.println(d);
		System.out.println(m);
		System.out.println(e1);
		System.out.println(e2);
		
		
	}

}
