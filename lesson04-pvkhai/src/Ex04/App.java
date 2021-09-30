package Ex04;

public class App {
	public static void main(String[] args) {
		Director d1 = new Director();
		CompanyUtils.inputDirector(d1);
		
		Manager m1 = new Manager();
		CompanyUtils.inputManager(m1);
		
		Employee e1 = new Employee();
		CompanyUtils.inputEmployee(e1);
		
		Employee e2 = new Employee();
		CompanyUtils.inputEmployee(e2);
		
		System.out.println(d1);
		System.out.println(m1);
		System.out.println(e1);
		System.out.println(e2); 
	}
}
