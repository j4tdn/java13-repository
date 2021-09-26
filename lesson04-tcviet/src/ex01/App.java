package ex01;

/**
 * Bài 1: Viết chương trình OOP quản lý sinh viên đơn giản: Nhập xuất thông tin, tính điểm TB.
 * @author vietdev
 *
 */
public class App {
	
	public static void main(String[] args) {
		Student sv1 = new Student(1, "Tran Cong Viet", 7.8f, 8.5f);
		Student sv2 = new Student(2, "Pham Thanh Nguyen", 8.1f, 9.0f);
		Student sv3 = StudentUtils.inputStudent();
		Student[] students = {sv1,sv2,sv3};
		
		System.out.println("=> Infomations of all students: ");
		StudentUtils.showAllStudents(students);
		System.out.println("===================================================");
		
		System.out.println("=> Students have average point bigger than 8,5: " );
		StudentUtils.averagePointAboveNumber(students, 8.5f);
		System.out.println("===================================================");
		
		System.out.println("=>Students have theoretical point bigger than practice point: " );
		StudentUtils.theoreticalAbovepracticePoint(students);
	}
	
}
