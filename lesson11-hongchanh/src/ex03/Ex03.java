package ex03;

import java.util.ArrayList;
import java.util.List;

import ex02.CD;

public class Ex03 {

	public static void main(String[] args) {
		
		List<Card> listCard = new ArrayList<>();
		listCard.add(new Card(2, rô));
		listCard.add(new Card(3, bích));
		printf(listCard);
		
		for(Num num: Num.values()) {
			System.out.println(num);
		}
	}
	
	private static void printf(List<Card> listCard) {
		for(Card card:listCard) {
			System.out.println(card);
		}
		System.out.println("===================================");
	}
	
}
