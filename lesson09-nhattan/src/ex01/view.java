package ex01;

import java.util.Arrays;

public class view {
	public static void main(String[] args) {
		Student[] students = { new Student(102, "Nam", Classification.C), new Student(103, "Bảo", Classification.F),
				new Student(104, "Hoàng", Classification.D), new Student(105, "Nguyên", Classification.B),
				new Student(107, "Vũ", Classification.F), new Student(109, "Lan", Classification.A),
				new Student(202, "Đạt", Classification.C), new Student(103, "Bảo", Classification.F),
				new Student(107, "Vũ", Classification.C), new Student(104, "Hoàng", Classification.B) };
		System.out.println(Arrays.toString(StudentUtils.getStudentsA(students)));
	}
}
