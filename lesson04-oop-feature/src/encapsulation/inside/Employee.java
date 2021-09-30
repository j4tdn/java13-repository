package encapsulation.inside;

public class Employee {
	public static void main(String[] args) {
		Company company = new Company();
		
		company.id = "c123";
		company.name = "n234";
		company.insurance = "2345";
//		company.fund >> private 
	}
}
