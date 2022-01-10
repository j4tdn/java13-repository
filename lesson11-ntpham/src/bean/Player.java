package bean;

import java.util.List;

public class Player {
	private String name;
	private List<Card> cards;
	
	public Player() {
	}

	public Player(String name, List<Card> cards) {
		super();
		this.name = name;
		this.cards = cards;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
}
