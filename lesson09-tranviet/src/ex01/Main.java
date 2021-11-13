package ex01;

/**
 * 
 * Bài 1(30đ): Trong năm 2021 có N sinh viên khoa CNTT đăng ký học phần cấu trúc
 * dữ liệu. Thông tin mỗi sinh viên được lưu trữ tại hệ thống gồm: Mã sinh viên,
 * Họ tên, Xếp loại Xếp loại học lực được lưu trong Enum với các giá trị: A, B,
 * C, D, E, F
 *
 */
public class Main {
	public static void main(String[] args) {
		//Data
		Student[] students = { new Student(102, "Nam", Academic.C), new Student(103, "Bảo", Academic.F),
				new Student(104, "Hoàng", Academic.D), new Student(105, "Nguyên", Academic.B),
				new Student(107, "Vũ", Academic.F), new Student(109, "Lan", Academic.A),
				new Student(202, "Đạt", Academic.C), new Student(103, "Bảo", Academic.F),
				new Student(107, "Vũ", Academic.C), new Student(104, "Hoàng", Academic.B) };
		
		Student[] AStudents = get2021AStudents(students);
		System.out.println("Danh sách sinh viên từng đạt loại A trong năm 2021: ");
		printStudents(AStudents);
		
		System.out.println("====================================================");
		
		Student[] learnAgainStudents = getLearnAgainStudents(students);
		System.out.println("Danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021: ");
		printStudents(learnAgainStudents);
	}

	private static void printStudents(Student[] students) {
		for (Student s : students) {
			if (s != null) {
				System.out.println(s);
			}
		}
	}
	
	//Method signature: getStudents(…) >> Student[]
	private static Student[] get2021AStudents(Student[] students) {
		Student[] A2021Students = new Student[students.length];
		int count = 0;
		for (Student s : students) {
			if (s.getAcademic() == Academic.A) {
				A2021Students[count++] = s;
			}
		}
		return A2021Students;
	}

	private static Student[] getLearnAgainStudents(Student[] students) {
		Student[] learnAgainStudents = new Student[students.length];
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if (!isExist(i, students)) {
				for (int j = 0; j < students.length; j++) {
					if (i != j && students[i].getId() == students[j].getId()) {
						learnAgainStudents[count++] = students[i];
					}
				}
			}
		}
		return learnAgainStudents;
	}

	private static boolean isExist(int i, Student[] students) {
		for (int j = 0; j < i; j++) {
			if (students[j].getId() == students[i].getId()) {
				return true;
			}
		}
		return false;
	}
}
