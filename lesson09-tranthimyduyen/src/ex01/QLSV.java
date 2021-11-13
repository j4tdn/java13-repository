package ex01;

public class QLSV {
	public static void main(String[] args) {
		Student[] students = { new Student(102, "Nam", Rank.A),
				new Student(103, "Bảo", Rank.F),
				new Student(104, "Hoàng", Rank.D), 
				new Student(105, "Nguyên", Rank.B), 
				new Student(107, "Vũ", Rank.F),
				new Student(109, "Lan", Rank.A), 
				new Student(202, "Đạt", Rank.C), 
				new Student(103, "Bảo", Rank.F),
				new Student(107, "Vũ", Rank.C), 
				new Student(104, "Hoàng", Rank.B) };

		Student[] studentsA = getStudentsA(students);
		Student[] studentsF = getStudentsF(students);

		System.out.println("Danh sach sinh vien dat loai A trong nam 2021 la: ");
		print(studentsA);
		System.out.println("Danh sach sinh vien tham gia hoc lai mon cau truc du lieu la: ");
		print(studentsF);

	}

	public static Student[] getStudentsA(Student[] students) {
		Student[] student = {};
		int i = 0;
		int j = 0;
		int c = 0;
		int[] k = null;// Chua cac id cua students trong mang Student
		int[] m = null;//Chua cac id trung nhau
		//tim cac gia tri cua mang k
		for (Student st : students) {
			k[j] = st.ID;
			j++;
		}
		//tim cac gia tri cua mang m
		for (int l = 0; l < k.length; l++) {
			for (int h = l + 1; h < k.length; h++) {
				if (k[l] == k[h]) {
					m[c] = k[l];
					c++;
				}
			}

		}
       //tim mang student
		for (Student st : students) {
			for (int o = 0; 0 < m.length; o++) {
				if (st.ID == m[o]) {
					student[i] = st;
					i++;
				}
			}
		}
		return student;
	}

	public static Student[] getStudentsF(Student[] students) {
		Student[] student = {};
		int i = 0;
		for (Student st : students) {
			if (st.Rank == "F") {
				student[i] = st;
				i++;
			}
		}
		return student;
	}

	public static void print(Student[] students) {
		for (Student st : students) {
			System.out.println(st.Name);
		}
	}
}
