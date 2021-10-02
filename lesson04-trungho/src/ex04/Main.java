package ex04;

public class Main {
	public static void main(String[] args) {
		// Enter Director information
		HumanResource drt1 = new Director();
		drt1.enterHumanResourceInfo();
		
		// Enter Chief information
		HumanResource chf1 = new Chief();
		chf1.enterHumanResourceInfo();
		
		// Enter Staff 1 information
		HumanResource stf1 = new Staff();
		stf1.enterHumanResourceInfo();
		
		// Enter Staff 2 information
		HumanResource stf2 = new Staff();
		stf2.enterHumanResourceInfo();
		
		// Print information of all Director, Chief and Staff
		System.out.println(drt1);
		System.out.println(chf1);
		System.out.println(stf1);
		System.out.println(stf2);
	}
}
