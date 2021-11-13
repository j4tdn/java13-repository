package ex01;

public class App {
	public static void main(String[] args) {
		Student[] students = {
				new Student(102, "Nam", Graded.C),
				new Student(103, "Bảo", Graded.F),
				new Student(104, "Hoàng", Graded.D),
				new Student(105, "Nguyên", Graded.B),
				new Student(107, "Vũ", Graded.F),
				new Student(109, "Lan", Graded.A),
				new Student(202, "Đạt", Graded.C),
				new Student(103, "Bảo", Graded.F),
				new Student(107, "Vũ", Graded.C),
				new Student(104, "Hoàng", Graded.B)
				};
		System.out.println("Student graded A:");
		showStudent(getStudentsGradedA(students));
		System.out.println("============================");
		System.out.println("Student Re-learn:");
		showStudent(getStudentsReLearn(students));
	}
	
	private static Student[] getStudentsGradedA(Student[] s) {
		int count = 0;
		
		for(int i = 0; i<s.length; i++) {
			if (s[i].isGradeA()) count ++;
		}
		Student[] a = new Student[count];
		int k = -1;
		for(int i = 0; i<s.length;i++) {
			if(s[i].isGradeA()) {
				k++;
				a[k] = s[i];
			}
		}
		return a;
	}
	private static Student[] getStudentsReLearn(Student[] s) {
		int countStu = 0;
		int k=-1;
		Student[] a = new Student[s.length];
		for(int i = 0; i<s.length-1; i++) {
			int count = 0;
			for(int j = i+1; j<s.length; j++) {
				if(s[i].getIdStudent() == s[j].getIdStudent()) {
					count++;
				}
			}
			if(count>0) {
				k++;
				countStu++;
				a[k] = s[i];
			}
		}
		int h= 0;
		Student[] b = new Student[countStu];
		return a;
	}
	private static void showStudent(Student[] a) {
		for(int i = 0; i<a.length; i++) {
			if(a[i]!=null) {
				System.out.println(a[i].toString());
			}
		}
	}
}
