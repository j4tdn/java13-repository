package Ex01;

public class Main {

	public static void main(String[] args) {
		Student[] students = { new Student(102, "Nam", ClassificationEnum.C),
				new Student(103, "Bảo", ClassificationEnum.F), new Student(104, "Hoàng", ClassificationEnum.D),
				new Student(105, "Nguyên", ClassificationEnum.B), new Student(107, "Vũ", ClassificationEnum.F),
				new Student(109, "Lan", ClassificationEnum.A), new Student(202, "Đạt", ClassificationEnum.C),
				new Student(103, "Bảo", ClassificationEnum.F), new Student(107, "Vũ", ClassificationEnum.C),
				new Student(104, "Hoàng", ClassificationEnum.B)

		};

		Student[] studentGradeA = StudentUtils.getStudentsGradeA(students);
		for (Student student : studentGradeA) {
			System.out.println(student);
		}

		Student[] studentLearnAgain = StudentUtils.getStudentLearnAgain(students);
		for (Student student : studentLearnAgain) {
			System.out.println(student);
		}
	}
}
