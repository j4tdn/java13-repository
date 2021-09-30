package ex04;

import java.time.LocalDate;

public class Main {
	public static void main(String[] args) {
		Boss boss = new Boss("Hứa Trọng Thưởng", LocalDate.of(2000, 10, 24), 11.0f, 5);
		Manager manager = new Manager("Phạm Huỳnh Văn Đạt", LocalDate.of(2000, 11, 4), 9.0f, 2 );
		Employee employee1 = new Employee("Lê Trung Nguyên", LocalDate.of(2000, 2, 1), 7.0f, "Dev");	
		Employee employee2 = new Employee("Nguyễn Văn Lâm", LocalDate.of(2000, 7, 26), 6.0f, "Tester");
		
		System.out.println("Nhân sự trong công ty: ");
		System.out.println(boss);
		System.out.println(manager);
		System.out.println(employee1);
		System.out.println(employee2);
		
		System.out.println("Lương sếp: " + boss.Salary());
		System.out.println("Lương trưởng phòng: "+ manager.Salary());
		System.out.println("Lương nhân viên 1: " + employee1.Salary());
		System.out.println("Lương nhân viên 2: " + employee2.Salary());
	}
	
	
}
