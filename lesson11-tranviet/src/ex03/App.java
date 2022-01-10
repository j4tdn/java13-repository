package ex03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

import utils.Utils;

public class App {
	public static void main(String[] args) {
		List<Card> cards = mockCards();
		Utils.printAll(cards);
		System.out.println("Card Size: " + cards.size());
		
		List<Player> players = mockPlayers();
		Utils.printAll(players);
		System.out.println("Player Size: " + cards.size());
		
		dealTheCards(players, cards);
		Utils.printAll(players);
	}
	private static void dealTheCards(List<Player> players, List<Card> cards) {
		Random rd = new Random();
		int turn = 0;
		int x =0;
		while(cards.size() != 0) {
			x = rd.nextInt(cards.size());
			players.get(turn).getCards().add(cards.get(x));
			cards.remove(x);
			turn++;
			if(turn == 4) {
				turn = 0;
			}
		}
	}
	private static List<Player> mockPlayers(){
		return Arrays.asList(new Player("Viet", new ArrayList<>()),
				new Player("Nguyen", new ArrayList<>()),
				new Player("Thien", new ArrayList<>()),
				new Player("Bao", new ArrayList<>())
				);
	}

	private static List<Card> mockCards() {
		List<Card> cards = new ArrayList<>();
		Rank[] ranks = Rank.values();
		CardType[] types = CardType.values();
		for (Rank rank : ranks) {
			for (CardType type : types) {
				Card card = new Card(rank, type);
				cards.add(card);
			}
		}
		return cards;
	}
}
