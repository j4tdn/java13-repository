package ex04;
/**
 * Viết chương trình quản lý nhân sự tại công ty A gồm các loại nhân sự sau đây.
	a. Giám đốc: họ tên, ngày sinh, hệ số lương, hệ số chức vụ.
	b. Trưởng phòng: họ tên, ngày sinh, hệ số lương, số lượng nhân viên quản lý
	c. Nhân viên: họ tên, ngày sinh, hệ số lương, tên đơn vị(phòng/ban)
	* @author PhoIndie
 **/
import java.time.LocalDate;

public class App {
	public static void main(String[] args) {
		Personnel p1 = FactoryPersonnel.CreateStaff("S1", LocalDate.of(2001, 9, 13), 1.5, "Guard"); 
		Personnel p2 = FactoryPersonnel.CreateStaff("S2", LocalDate.of(2001, 4, 12), 2, "cleaning staff"); 
		Personnel p3 = FactoryPersonnel.CreateDirector("D1", LocalDate.of(2001, 10, 7), 3, 4); 
		Personnel p4 = FactoryPersonnel.CreateManager("M1", LocalDate.of(2001, 7, 28), 2.5, 2); 
		
		System.out.println("List information of personnel: ");
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println(p4);
	}
}
