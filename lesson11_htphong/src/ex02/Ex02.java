package ex02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		List<CD> myCDs = new ArrayList<>();
		myCDs.add(new CD(111,"Nhạc Xuân", "Xuân Trường", 15, 15000));
		myCDs.add(new CD(123,"Bolero", "Cẩm Ly", 20, 23000));
		myCDs.add(new CD(124,"VPOP", "Sơn Tùng MTP", 10, 12000));
		myCDs.add(new CD(145,"KPOP", "Bae Suzy", 7, 8000));
		myCDs.add(new CD(155,"Trữ Tình", "Đàm Vĩnh Hưng", 16, 15500));
		
		printf(myCDs);
		System.out.println("===================================");
		addCDs(myCDs, new CD(100,"Nhạc kịch", "Hoài Linh", 8, 9500));
		printf(myCDs);
		System.out.println("Amount of CDs: " + myCDs.size() + " CDs");
		System.out.println("Total Price = " + getSumPrice(myCDs));
		
		System.out.println("===================================");
		System.out.println("Sort by Price >> Descending");
		printf(sortByPrice(myCDs));
		
		System.out.println("===================================");
		System.out.println("Sort by Id >> Ascending");
		printf(sortById(myCDs));
	}
	private static void addCDs(List<CD> nowCDs, CD newCD) {
		boolean check = false;
		for(CD cd:nowCDs) {
			if(cd.getIdCD()==newCD.getIdCD()) {
				check = true;
			}
		}
		if(check==false) nowCDs.add(newCD); 
	}
	private static double getSumPrice(List<CD> nowCDs) {
		double sumPrice = 0;
		for(CD cd : nowCDs) {
			sumPrice += cd.getPrice();
		}
		return sumPrice;
		
	}
	private static List<CD> sortByPrice(List<CD> nowCDs){
		List<CD> result = nowCDs;
		Collections.sort(result, Comparator.comparing(CD::getPrice, Comparator.reverseOrder()));
		return result;
	}
	private static List<CD> sortById(List<CD> nowCDs){
		List<CD> result = nowCDs;
		Collections.sort(result, Comparator.comparing(CD::getIdCD));
		return result;
	}
	private static void printf(List<CD> nowCDs) {
		for(CD cd:nowCDs) {
			System.out.println(cd);
		}
	}
}
