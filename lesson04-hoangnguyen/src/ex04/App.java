package ex04;

public class App {
	
	public static void main(String[] args) {
		Company director = new Director("Nguyễn Hoàng Nguyên", "28/12/1994", 3.15f, 1.5f);
		Company manager = new Manager("Nguyễn Văn A", "2/4/1916", 3.15f, 10);
		Company employee1 = new Employee("Nhân viên 1", "5/1/1989", 2.8f, "Phòng A");
		Company employee2 = new Employee("Nhân viên 2", "5/7/1999", 2.8f, "Phòng B");
		Company[] companies = {director, manager, employee1, employee2};
		
		CompanyUtils.displayAll(companies);
	}
}
