package ex01;
/**
 * Viết chương trình OOP quản lý sinh viên đơn giản: Nhập xuất thông tin, tính điểm TB.
 * @author PhoIndie
 */
public class App {
	public static void main(String[] args) {	
		Student sv1 = new Student(1, "Pham Thanh Nguyen", 6.5f, 7);
		Student sv2 = new Student(2, "Tran Cong Viet", 9, 10);
		Student sv3 = new Student();
		Student[] students = {sv1, sv2, sv3};
		
		StudentUtils.getInfoStudent(sv3);
		
		// List students have average point above 8.5: 
		StudentUtils.AveragePointAbove(students);
		
		//List students have theoretical point above practice point: 
		StudentUtils.theoretialPointAbovePracticePoint(students);
	}
}
