package ex01;

import java.util.ArrayList;

public class App {
	public static void main(String[] args) {
		Student[] students = {
			new Student(102, "Nam", Score.C),
			new Student(103, "Bảo", Score.F),
			new Student(104, "Hoàng", Score.D),
			new Student(105, "Nguyên", Score.B),
			new Student(107, "Vũ", Score.F),
			new Student(109, "Lan", Score.A),
			new Student(202, "Đạt", Score.C),
			new Student(103, "Bảo", Score.F),
			new Student(107, "Vũ", Score.C),
			new Student(104, "Hoàng", Score.B)
		};
		
		ArrayList<Student> list = getStudentHasScoreA(students);
		System.out.println("Danh sách sinh viên từng đạt loại A trong năm 2021:");
		System.out.println(list);
		
		
	}
	private static ArrayList<Student> getStudentHasScoreA(Student[] students){
		ArrayList<Student> list = new ArrayList<Student>();
		for(Student student :students ) {
			if(student.getScore() == Score.A) {
				list.add(student);
			}
		}
		return list;
	}
	
	private static void getStudentLearnAgain(Student[] students) {
		ArrayList<Student> list = new ArrayList<Student>();
		int[] ids = new int[students.length];
		for(int i = 0; i < students.length; i++) {
			ids[i] = students[i].getId();
		}
		
		
		
		
	}
	
	private static boolean countId(int[] ids) {
		
	}
	
}	
