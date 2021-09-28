package ex04;

public class App {
	public static void main(String[] args) {
		Director drt = new Director("Nguyen Van A", "21/10/1990", 3.5f, 2.0f);
		Manager mag = new Manager("Nguyen Van B", "19/12/1992",3.0f, 2);
		Employee emp1 = new Employee("Nguyen Van C", "12/02/1994",2.5f, "Financial");
		Employee emp2 = new Employee("Nguyen Van D", "05/11/1997",2.3f, "Human");
		People[] p = {drt,mag,emp1,emp2};
		Company company = new Company(p);
		company.showEmployee();
		company.showSalary();
	}
}
