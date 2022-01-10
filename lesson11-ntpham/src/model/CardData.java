package model;

import java.util.ArrayList;
import java.util.List;

import bean.Card;
import bean.RankCard;
import bean.TypeCard;

public class CardData {
	private CardData() {
	}
	
	public static List<Card> getAll() {
		List<Card> cards = new ArrayList<Card>();
		for (TypeCard type : TypeCard.values()) {
			for (RankCard rank : RankCard.values()) {
				cards.add(new Card(type, rank));
			}
		}
		return cards;
	}
}
