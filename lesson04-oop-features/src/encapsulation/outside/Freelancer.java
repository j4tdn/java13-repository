package encapsulation.outside;

import encapsulation.inside.Company;

public class Freelancer {
	public static void main(String[] args) {
		Company company = new Company();
		
		company.id = "C123";
		company.name = "N234";
		//company.insurance = "I345";>>protected,default
		
		//company.fund>>private
	}
}
