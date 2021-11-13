package ex01;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students =
		{
		new Student(102, "Nam", Mark.C),
		new Student(103, "Bao", Mark.F),
		new Student(104, "Hoang",  Mark.D),
		new Student(105, "Nguyen",  Mark.B),
		new Student(107, "Vu",  Mark.F),
		new Student(109, "Lan",  Mark.A),
		new Student(202, "Dat",  Mark.C),
		new Student(103, "Bao",  Mark.F),
		new Student(107, "Vu",  Mark.C),
		new Student(104, "Hoang",  Mark.B)
		};
		
		Student[] a = getStudentsA(students);
		Student[] b = check(students);

		show(a);
		//show(b);
	}
	
	private static void show(Student[] students) {
		for (Student student : students) {
			if(student!=null)
				System.out.println(student);
		}
		
		System.out.println("======================");
	}
	
	private static Student[] getStudentsA(Student[] students) {
		Student[] result = new Student[students.length];
		int k=0;
		for (Student student : students) {
			if (student.getMark() == Mark.A) {
				result[k] = student;
				k++;
			}
		}
		return result;

	}
	
	private static Student[] check(Student[] students) {
		Student[] result = new Student[students.length];
		int k=0;
		for (Student a: students) {
			int x=0;
			for (int t =0; t< students.length; t++ ) {
				if(a.getId() == students[t].getId()) {
					x++;
					if(x>1) {
					result[k] = a;
					k++;
					}
				}
			}
		}
		return result;
	}
	
	private static boolean test(Student a, Student[] b) {
		for (Student c: b) {
			if(a.getId()==c.getId()) {
				return false;
			}
		}
		return true;
	}

}
