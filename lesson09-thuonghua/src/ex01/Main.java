package ex01;

public class Main {
	public static void main(String[] args) {
		Student st1 = new Student(102, "Nam", Type.C);
		Student	st2 = new Student(103, "Bảo", Type.F);
		Student st3 = new Student(104, "Hoàng", Type.D);
		Student	st4 = new Student(105, "Nguyên", Type.B);
		Student	st5 = new Student(107, "Vũ", Type.F);
		Student	st6 = new Student(109, "Lan", Type.A);
		Student	st7 = new Student(202, "Đạt", Type.C);
		Student	st8 = new Student(103, "Bảo", Type.F);
		Student	st9 = new Student(107, "Vũ", Type.C);
		Student	st10 = new Student(104, "Hoàng", Type.B);
		
		Student students[] = {st1,st2,st3,st4,st5,st6,st7,st8,st9};
		
		for (Student student : students) {
			if(student.getClassification() == Type.A) {
				System.out.println(student);
			}
		}
	}

}
