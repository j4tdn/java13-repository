package ex03;

public class Card {
	Rank rank;
	CardType type;

	public Card() {
	}

	public Card(Rank rank, CardType type) {
		this.rank = rank;
		this.type = type;
	}

	public Rank getRank() {
		return rank;
	}

	public void setRank(Rank rank) {
		this.rank = rank;
	}

	public CardType getType() {
		return type;
	}

	public void setType(CardType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "\nCard [rank=" + rank + ", type=" + type + "]";
	}

}
