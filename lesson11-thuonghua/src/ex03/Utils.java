package ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Utils {
	
	private Utils() {
		// TODO Auto-generated constructor stub
	}
	
	public static List<Cards> createCard(List<String> num, List<String> type){
		List<Cards> card = new ArrayList<>();
		for (int i = 0; i < num.size(); i++) {
			for (int j = 0; j < type.size(); j++) {
				Cards oneCard = new Cards(num.get(i), type.get(j));
				card.add(oneCard);
			}
		}
		return card;
	}

	public static void shuffle(List<Cards> card) {
		List<Cards> player1 = new ArrayList<Cards>();
		List<Cards> player2 = new ArrayList<Cards>();
		List<Cards> player3 = new ArrayList<Cards>();
		List<Cards> player4 = new ArrayList<Cards>();
		int r = 0;
		Random rand = new Random();
		List<Cards> newListcard = new ArrayList<>();

		while (!card.isEmpty()) {
			r = rand.nextInt(card.size());
			if (card.contains(card.get(r))) {
				newListcard.add(card.get(r));
				card.remove(r);
			}
		}

		for (Cards element : newListcard) {
			if (player1.size() < 13) {
				player1.add(element);
				if(player1.size() == 13) {
					continue;
				}
			}
			if (player1.size() == 13 && player2.size() < 13) {
				player2.add(element);
				if(player2.size() == 13) {
					continue;
				}
			}
			if (player2.size() == 13 && player3.size() < 13) {
				player3.add(element);
				if(player3.size() == 13) {
					continue;
				}
			}
			if (player3.size() == 13 && player4.size() < 13) {
				player4.add(element);
				if(player4.size() == 13) {
					continue;
				}
			}
		}
		System.out.println("Player 1: " + player1);
		System.out.println("Player 2: " + player2);
		System.out.println("Player 3: " + player3);
		System.out.println("Player 4: " + player4);
	}
}
