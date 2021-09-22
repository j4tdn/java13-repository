package encapsulation.inside;

public class Employee {
	public static void main(String[] args) {
		Company company = new Company();
		
		company.id = "C123";
		company.name = "N234";
		company.insurance = "I345";
		
		// company.fund >> private
	}
}
