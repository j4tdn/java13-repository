package view;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

import bean.CD;

public class Ex02 {
	public static void main(String[] args) {
		Set<CD> cD = new HashSet<>();
		CD cD1 = new CD(1, "RAP", "MCK", 2, 300d);
		CD cD2 = new CD(2, "POP", "Son Tung", 5, 1000d);
		CD cD3 = new CD(3, "HIPHOP", "Giang", 3, 400d);
		
		cD.add(cD1);
		cD.add(cD2);
		cD.add(cD3);
		
		CD cD4 = new CD(1, "RAP", "MCK", 2, 300d);
		if(!cD.contains(cD4)) {
			cD.add(cD4);
		}
		System.out.println("size: " + cD.size());
		double sum = 0;
		for(CD c : cD) {
			sum += c.getPrice();
		}
		
		System.out.println("Tổng giá thành: " + sum);
		
		System.out.println("Sắp xếp theo mã CD: ");
		for (CD cd : cD) {
            System.out.println(cd);
        }
		
		
	}
}
