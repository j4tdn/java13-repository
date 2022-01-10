package ex02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import static java.util.Comparator.*;

public class Utils {
	private Utils() {

	}
	
	public static void sortPriceDSC(CD[] cds) {
		Comparator<CD> comparator = comparing(CD::getPrice,reverseOrder());
		Arrays.sort(cds, comparator);
		for(CD cd :cds) {
			System.out.println(cd);
		}
	}
	
	public static void sortIdASC(CD[] cds) {
		Comparator<CD> comparator = comparing(CD::getId);
		Arrays.sort(cds, comparator);
		for(CD cd :cds) {
			System.out.println(cd);
		}
	}
	
	public static double sumPrice(List<CD> cds) {
		double sum = 0;
		for(CD cd: cds) {
			sum += cd.getPrice();
		}
		return sum;
	}
	
	public static boolean check(CD e) {
		List<CD> cds = getData();
		for(CD cd: cds) {
			if(cd.getId() == e.getId()) return false;
		}
		return true;
	}

	public static List<CD> addCD(CD e) {
		List<CD> cds = getData();
		if(check(e)) {
			cds.add(e);
			System.out.println("Add Success");
		}else {
			System.out.println("Add Fail");
		}
		return cds;
	}

	public static List<CD> getData(){

		CD cd1 = new CD(2, "POP", "John", 3, 115.5);
		CD cd2 = new CD(1, "DANCE", "Smith", 5, 220);
		CD cd3 = new CD(4, "POP", "Alice", 3, 110);
		CD cd4 = new CD(3, "DANCE", "Victor", 4, 180);
		List<CD> cds = new ArrayList<CD>();
		cds.add(cd1);
		cds.add(cd2);
		cds.add(cd3);
		cds.add(cd4);
		return cds;
	}

	public static void printf(List<CD> cds) {
		for(CD cd: cds) {
			System.out.println(cd);
		}
	}
}
