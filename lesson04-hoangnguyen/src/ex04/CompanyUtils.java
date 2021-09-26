package ex04;

public class CompanyUtils {
	
	public static void displayAll(Company[] companies) {
		System.out.println("Thông tin tất cả nhân sự trong công ty: ");
		
		for(Company people : companies) {
			System.out.println(people);
		}
	}
	
}
