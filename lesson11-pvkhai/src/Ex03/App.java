package Ex03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class App {
	public static void main(String[] args) {
		List<Card> set = getListCard();
		
		System.out.println(set);
		
		
	}
	
	private static List<Card> getListCard() {
		List<Card> set = new ArrayList<>(52);
		
		Rank[] ranks = Rank.values();
		Type[] types = Type.values();
		
		for(Rank rank: ranks) {
			for(Type type: types) {
				set.add(new Card(rank,type));
			}
		}
		return set;
	}
	
	
}
