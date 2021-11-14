package ex01;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		Student[] students =
		{
		new Student(102, "Nam", Rank.C),
		new Student(103, "Bảo", Rank.F),
		new Student(104, "Hoàng", Rank.D),
		new Student(105, "Nguyên", Rank.B),
		new Student(107, "Vũ", Rank.F),
		new Student(109, "Lan", Rank.A),
		new Student(202, "Đạt", Rank.C),
		new Student(103, "Bảo", Rank.F),
		new Student(107, "Vũ", Rank.C),
		new Student(104, "Hoàng", Rank.B)
		};
		System.out.println("Học sinh đạt học lực loại A: ");
		Student[] studentA = getStudents(students, Rank.A); 
		for(Student st : studentA) {
			System.out.println(st);
		}
		
		System.out.println("Học sinh học lại: ");
		Student[] studentF = getStudents(students, Rank.F); 
		for(Student st : studentF) {
			System.out.println(st);
		}
	}
	
	private static Student[] getStudents(Student[] students, Rank rank) {
			Student[] lists = new Student[students.length];
			int count = 0;
			for (int i = 0; i < students.length; i++) {
				if(students[i].getRank() == rank) {
					lists[count++] = students[i];
				}
			}
			return Arrays.copyOfRange(lists, 0, count);
			
	}
}
