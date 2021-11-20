package ex01;

import utils.AppUtils;

public class App {

	// declaration
	private static StudentDao studentDao;
	private static StudentService studentService;

	// assignment
	static {
		studentDao = new StudentDao();
		studentService = new StudentService();
	}

	public static void main(String[] args) {
		// TODO: BACK TO USE STREAM NOT GREATER THAN 10 LINES OF CODE LATER
		
		Student[] students = studentDao.getAll();

		// Tìm danh sách sinh viên từng đạt loại A trong năm 2021
		Student[] studentsWithRankA = studentService.getStudents(students, Rank.A);
		AppUtils.print(studentsWithRankA);
		
		System.out.println("\n=================\\\\\\\\\\=================\n");
		
		// Tìm danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021.
		Student[] relearnedStudents = studentService.getStudents(students);
		AppUtils.print(relearnedStudents);
	
	}

}
