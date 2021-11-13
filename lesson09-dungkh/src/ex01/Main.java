package ex01;

public class Main {
	public static void main(String[] args) {
		Student[] Student = {
                new Student("102", "Nam", Point.C),
                new Student("104", "Hoàng", Point.D),
                new Student("109", "Lan", Point.A),
                new Student("103", "Bảo", Point.F),
                new Student("105", "Nguyên", Point.B),
                new Student("107", "Vũ", Point.F),
                new Student("103", "Bảo", Point.F),
                new Student("202", "Đạt", Point.C),
                new Student("107", "Vũ", Point.C),
                new Student("193", "Bảo", Point.B),
                new Student("104", "Hoàng", Point.B)
                };
		studentGetA(Student);
		studenLearnAgain(Student);
	}
	
	private static void studentGetA(Student[] Students) {
        for (Student Student : Students) {
            if (Student.getLevel() == Point.A) {
                System.out.println("Student get A: " + Student);
            }
        }
    }
	
	public static void studenLearnAgain(Student[] Students){
		for(int i = 0; i < Students.length; i++) {
			for(int j = i + 1; j < Students.length; j++) {
				if(Students[i].getId()==Students[j].getId()) {
					System.out.println("Student learn again :" +Students[i] + " Point learn Again: " +Students[j].getLevel());
				}
			}
		}
	}

}
