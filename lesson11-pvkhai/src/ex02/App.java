package ex02;

import java.util.List;

public class App {
	public static void main(String[] args) {
		CD cd5 = new CD(4, "POP", "David", 3, 220);
		
		List<CD> cds = Utils.addCD(cd5);
		
		Utils.printf(cds);
		
		System.out.println("============="); 
		System.out.println("Number of CD in List: " + cds.size());
		
		System.out.println("============="); 
		double sum = Utils.sumPrice(cds);
		System.out.println("Sum Price: " + sum);
		
		System.out.println("============="); 
		System.out.println("Price DSC"); 
		Utils.sortPriceDSC(cds.toArray(new CD[cds.size()]));
		
		System.out.println("============="); 
		System.out.println("Id ASC"); 
		Utils.sortIdASC(cds.toArray(new CD[cds.size()]));
		
		
	}
	
	
}
