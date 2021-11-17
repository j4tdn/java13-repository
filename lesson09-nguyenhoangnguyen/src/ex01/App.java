package ex01;

import utils.AppUtils;

public class App {
	
	// Declaration
	private static StudentDAO studentDao;
	private static StudentServices studentServices;
	
	// Assignment
	static {
		studentDao = new StudentDAO();
		studentServices = new StudentServices();
	}
	
	public static void main(String[] args) {
		Student[] students = studentDao.getAll();
		
		// Tìm danh sách sinh viên từng đạt loại A
		Student[] studentsWithRankA = studentServices.getStudents(students, Rank.A);
		AppUtils.print(studentsWithRankA);
		System.out.println("=====================================");
		Student[] studentsDuplicated = studentServices.getStudents(students);
		AppUtils.print(studentsDuplicated);
	}
	
	
}
