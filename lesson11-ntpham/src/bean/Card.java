package bean;

public class Card {
	private TypeCard type;
	private RankCard rank;
	private boolean devided;
	
	public Card() {
	}

	public Card(TypeCard type, RankCard rank) {
		this.type = type;
		this.rank = rank;
		this.devided = false;
	}

	public TypeCard getType() {
		return type;
	}

	public void setType(TypeCard type) {
		this.type = type;
	}

	public RankCard getRank() {
		return rank;
	}

	public void setRank(RankCard rank) {
		this.rank = rank;
	}
	
	public boolean isDevided() {
		return devided;
	}

	public void setDevided(boolean devided) {
		this.devided = devided;
	}

	@Override
	public String toString() {
		return "Card [rank=" + rank + ", type=" + type + "] ||";
	}
}
