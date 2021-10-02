package encapsulation.outside;

import encapsulation.inside.Company;

public class Freelencer {
	public static void main(String[] args) {
		Company company = new Company();
		
		company.id = "C123";
		company.name = "N234";
		
		// defaut || protected => không truy cập được vì đang nằm ngoài package
		//company.insurance = "I345";
		
		// company.fund >> X (private)
	}
}
