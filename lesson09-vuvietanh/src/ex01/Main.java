package ex01;

public class Main {
	public static void main(String[] args) {
		Student[] student ={new Student(102, "Nam", Category.C), 
							new Student(103, "Bảo", Category.F),
							new Student(104, "Hoàng", Category.D), 
							new Student(105, "Nguyên", Category.B),
							new Student(107, "Vũ", Category.F), 
							new Student(109, "Lan", Category.A),
							new Student(202, "Đạt", Category.C), 
							new Student(103, "Bảo", Category.F),
							new Student(107, "Vũ", Category.C), 
							new Student(104, "Hoàng", Category.B) };

		Student[] againStudents = getLearnAgain(student);
		for (Student st : againStudents) {
			if(!(st==null)) {
			System.out.println(st);
			}
		}

		System.out.println("=======================");

		Student[] categoryStudent = category(student);
		for (Student st : categoryStudent) {
			if(!(st == null)) {
			System.out.println("Sinh viên xếp loại A : " + st);
			}
		}
	}
	private static Student[] category(Student[] students) {
		Student[] st = new Student[students.length];
		int index = 0;
		for (Student student : students) {
			if (student.getCategory() == Category.A) {
				st[index] = student;
			}
		}
		return st;
	}

	private static Student[] getLearnAgain(Student[] student) {
		Student[] st = new Student[student.length];
		int index = 0;
		for (int i = 0; i < student.length; i++) {
			for (int j = i + 1; j < student.length; j++) {
				if (student[i].getId() == student[j].getId()) {
					st[index] = student[i];
					index++;
				}
			}
		}
		return st;
	}

}
