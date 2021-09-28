package Ex04;

import java.time.LocalDate;

public class View {
	public static void main(String[] args) {
		Director d1 = new Director("tran thi bao quyen",LocalDate.of(1990, 3, 7),3, 2);
		Manager m1 = new Manager("Tran Van A", LocalDate.of(1995, 2, 1), 2, 20);
		Staffs s1 = new Staffs("Nguyen Thi B", LocalDate.of(1997, 4, 30), 1,  "Marketing");
		Staffs s2 = new Staffs("Phan Thi C", LocalDate.of(2001, 5, 15), 1, "HR");
		System.out.println("Employee 's information:");
		System.out.println(d1);
		System.out.println(m1);
		System.out.println(s1);
		System.out.println(s2);
		
		
	}
}
