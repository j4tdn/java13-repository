package Ex04;


import java.util.Scanner;

public class CompanyUtils {
	public static Director inputDirector(Director d) {
		System.out.println("Dirctor: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("name: ");
		d.setName(sc.nextLine());
		System.out.println("date of birth: ");
		d.setDateOfBirth(sc.nextLine());
		System.out.println("numberOfSalary: ");
		d.setNumberOfSalary(sc.nextFloat());
		System.out.println("numberOfPosition: ");
		d.setNumberOfPosition(sc.nextFloat());
		return d;
	}
	
	public static Manager inputManager(Manager m) {
		System.out.println("Manager: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("name: ");
		m.setName(sc.nextLine());
		System.out.println("date of birth: ");
		m.setDateOfBirth(sc.nextLine());
		System.out.println("numberOfSalary: ");
		m.setNumberOfSalary(sc.nextFloat());
		System.out.println("numberOfEmployee: ");
		m.setNumberOfEmployee(sc.nextInt());
		return m;
	}
	
	public static Employee inputEmployee(Employee e) {
		System.out.println("Employee: ");
		Scanner sc = new Scanner(System.in);
		System.out.println("name: ");
		e.setName(sc.nextLine());
		System.out.println("date of birth: ");
		e.setDateOfBirth(sc.nextLine());
		System.out.println("numberOfSalary: ");
		e.setNumberOfSalary(Float.parseFloat(sc.nextLine()));
		System.out.println("department: ");
		e.setDepartment(sc.nextLine());
		return e;
	}
}
