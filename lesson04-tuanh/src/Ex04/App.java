package Ex04;

/**
 * Bài 4: Viết chương trình quản lý nhân sự tại công ty A gồm các loại nhân sự sau đây:
 * a. Giám đốc: Họ tên, ngày sinh, hệ số lương, số lượng nhân viên quản lý.
 * b. Trưởng phòng: Họ tên, ngày sinh, hệ số lương, số lượng nhân viên quản lý.
 * c. Nhân viên: Họ tên, ngày sinh, hệ số lương, tên đơn vị (phòng/ban).
 */

public class App {
public static void main(String[] args) {
	Director director = new Director();
	director.Input();
	director.Output();
	
	Manager manager = new Manager();
	manager.Input();
	manager.Output();
	
	Employee employee = new Employee();
	employee.Input();
	employee.Output();
	employee.Input();
	employee.Output();
}
}
