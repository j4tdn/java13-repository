package ex04;

public class App {
	public static void main(String[] args) {
		Director d1 = new Director("Việt Anh", 1994, 7, 5);
		Manager m1 	= new Manager("Vũ Anh", 1993, 4, 10);
		Employee e1 = new Employee("Công Vinh", 2000, 3,"Marketing");
		Employee e2 = new Employee("Vinh Tomas", 1999, 3,"Marketing");
		
		System.out.println("Tên NV   Năm sinh\tHệ số lương\tHệ số chức Vụ\tSố lượng QL\tPhòng/Ban\tTiền Lương");
		System.out.println("=====================================================================");
	
		System.out.println(d1);
		System.out.println(m1);
		System.out.println(e1);
		System.out.println(e2);
	}
}
