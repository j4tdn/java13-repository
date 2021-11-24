package ex01;

public class Main {
	public static void main(String[] args) {
		Student [] student = { new Student(102, "Nam", Rank.C), 
				new Student(103, "Bảo", Rank.F),
				new Student(104, "Hoàng", Rank.D), 
				new Student(105, "Nguyên", Rank.B),
				new Student(107, "Vũ", Rank.F), 
				new Student(109, "Lan", Rank.A),
				new Student(202, "Đạt", Rank.C), 
				new Student(103, "Bảo", Rank.F),
				new Student(107, "Vũ", Rank.C), 
				new Student(104, "Hoàng", Rank.B) };
		Student[] getRank = getRank(student);
		for (Student st : getRank) {
			if(!(st == null)) {
				System.out.println(st);
			}
		}
		System.out.println("=========================");
		
		Student[] getLearnAgain = getLearnAgain(student);
		for(Student st : getLearnAgain) {
			if(!(st == null)) {
				System.out.println(st);
			}
		}
		
	}
	private static Student[] getRank(Student [] student) {
		Student [] result = new Student[student.length];
		int index = 0;
			for(Student st : student ) {
				if(st.getRank().equals(Rank.A)) {
					result[index] = st;
					index++;
				}
			}
		
		return result;
	}
	private static Student[] getLearnAgain(Student[] student) {
		Student [] result = new Student[student.length];
		int index = 0;
		for(int i = 0; i<student.length;i++) {
			for(int j = i+1;j < student.length;j++ ) {
				if (student[i].getId() == student[j].getId()) {
					result[index] = student[i];
					index++;
				}
			}
		}
		
		return result;
	}
}
