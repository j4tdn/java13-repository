package ex02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Ex02 {
	
	public static void main(String[] args) {
		
		List<CD> listCD = new ArrayList<>();
		listCD.add(new CD(001,"Kpop", "T-ara", 20, 15000));
		listCD.add(new CD(002,"Beat Piano", "Mozzad", 20, 16000));
		listCD.add(new CD(003,"Vpop", "Noo", 10, 12000));
		listCD.add(new CD(004,"EDM", "Alan Walker", 10, 20000));
		listCD.add(new CD(005,"Lofi", "Nguyễn Văn Chung", 10, 18000));
		
		printf(listCD);
		
		add(listCD, new CD(006,"US UK", "Adele", 7, 22000));
		printf(listCD);
		
		System.out.println("So luong: " + listCD.size());
		System.out.println("Tong tien: " + getSumPrice(listCD));
		
		System.out.println("Giam dan theo gia: ");
		printf(sortByPrice(listCD));
		
		System.out.println("tang dan theo ID: ");
		printf(sortById(listCD));
	}
	private static void add(List<CD> songList, CD newCD) {
		
		boolean check = false;
		for(CD cd:songList) {
			if(cd.getIdCD()==newCD.getIdCD()) {
				check = true;
				break;
			}
		}
		if(check==false) songList.add(newCD); 
	}
	private static double getSumPrice(List<CD> songList) {
		
		double sum = 0;
		for(CD cd : songList) {
			sum += cd.getPrice();
		}
		return sum;
		
	}
	private static List<CD> sortByPrice(List<CD> songList){
		
		List<CD> result = songList;
		Collections.sort(result, Comparator.comparing(CD::getPrice, Comparator.reverseOrder()));
		
		return result;
	}
	private static List<CD> sortById(List<CD> songList){
		
		List<CD> result = songList;
		Collections.sort(result, Comparator.comparing(CD::getIdCD));
		
		return result;
	}
	private static void printf(List<CD> songList) {
		for(CD cd:songList) {
			System.out.println(cd);
		}
		System.out.println("===================================");
	}
}