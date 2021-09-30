package Ex01;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Student sv1 = new Student(73, "Phạm Văn Khải", 8.2f, 8.0f);
		Student sv2 = new Student(82, "Đỗ Văn Minh", 8.9f, 8.5f);
		Student sv3 = new Student();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập id: ");
		int id = Integer.parseInt(sc.nextLine());
		System.out.println("Nhập name: ");
		String name = sc.nextLine();
		System.out.println("Nhập điểm lý thuyết: ");
		float  theoMark = sc.nextFloat();
		System.out.println("Nhập điểm thực hành: ");
		float pracMark = sc.nextFloat();
		
		sv3.setId(id);
		sv3.setName(name);
		sv3.setTheoMark(theoMark);
		sv3.setPracMark(pracMark);
		
		Student[] svs = {sv1, sv2, sv3};
		
		System.out.println("Những sinh viên có điểm TB > 8.5: ");
		StudentUtils.averMarkThan85(svs);
		System.out.println("Những sinh viên có điểm LT cao hơn điểm TH: ");
		StudentUtils.theoMarkThanPracMark(svs);
		
	}
}
