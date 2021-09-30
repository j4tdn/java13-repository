package ex04;



public class App {
	public static void main(String[] args) {
		Director director = new Director("Hoang Khac Dung","1999" ,10.0f, 3.0f);
		Manager manager = new Manager("Hoang Khac Dat","1999",5.0f, 6);
		Employee employee1 = new Employee("Hoang Khac Chau","1999",1.5f,"3a");
		Employee employee2 = new Employee("Hoang Khac Ca","1999",1.5f,"2a");
		System.out.println("Nhân sự trong công ty: ");
		System.out.println(director);
		System.out.println(manager);
		System.out.println(employee1);
		System.out.println(employee2);
	}
	
	 
}
