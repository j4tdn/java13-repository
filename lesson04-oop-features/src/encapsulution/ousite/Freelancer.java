package encapsulution.ousite;
/*
 *  encapsulation duoc the hien qua access modifier 
 *  public : goi ow dau cung duoc
 *  protected/default : goij trong cung pakage
 *  private chi sd trong class
 */
import encapsulation.inside.Company;

public class Freelancer {
	public static void main(String[] args) {
		Company company = new Company();
		
		company.id = "c123";
		company.name = "n234";
//		default || protected >> chi goi duoc trong cung pakage
//		company.insurance = "2345";
//		company.fund >> private 
	}

}
