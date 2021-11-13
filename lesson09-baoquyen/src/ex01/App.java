package ex01;

import java.util.Arrays;

import javax.net.ssl.SSLContext;

public class App {
	public static void main(String[] args) {
		Student [] students =
		{
		new Student(102, "Nam", Grade.C),
		new Student(103, "Bảo", Grade.F),
		new Student(104, "Hoàng", Grade.D),
		new Student(105, "Nguyên", Grade.B),
		new Student(107, "Vũ", Grade.F),
		new Student(109, "Lan", Grade.A),
		new Student(202, "Đạt", Grade.C),
		new Student(103, "Bảo", Grade.F),
		new Student(107, "Vũ", Grade.C),
		new Student(104, "Hoàng", Grade.B)
		};
		
		System.out.println("Danh sách sinh viên đạt điểm A:");
		Student [] s = getStudent(Grade.A, students);
		printArray(s);
		System.out.println("Danh sách sinh viên học lại:");
		Student [] s1 = getDoubleStudent(students);
		printArray(s1);
		
		
		
	}
	
	private static Student [] getStudent(Grade grade, Student [] students) {
		Student [] result = new Student[students.length];
		int index = 0;
		for(int i = 0; i< students.length ; i++) {
			if(grade.equals(students[i].getGrade())) {
				result[index] = students[i];
				index++;
			}
		}
		result = Arrays.copyOf(result, index);
		return result;
	}
	
	
	private static void printArray(Student[] s) {
		for(int i = 0; i < s.length; i++) {
			System.out.println(s[i].toString());
		}
	}
	
	private static Student [] sort(Student[] s) {
		for(int i = 0 ; i < s.length; i++ ) {
			for(int j = i+1; j< s.length; j++) {
				if(s[i].getId() > s[j].getId()) {
					int temp = s[i].getId();
					s[i].setId(s[j].getId());
					s[j].setId(temp);
				}
			}
			
		}
		return s;
	}
	
	private static Student[] getDoubleStudent(Student [] s) {
		Student[] result = new Student [s.length];
//		sort(s);
		int index = 0;
		for(int i = 0; i < s.length-1; i++) {
			if(s[i].getId() == s[i+1].getId()) {
				result[index] = s[i];
				index++;
			}
			
		}
		result = Arrays.copyOf(result, index);
		return result;
	}
}
