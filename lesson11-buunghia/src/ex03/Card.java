package ex03;

public class Card {
	String suit;
	String value;
	public Card() {
		
	}
	public Card(String suit, String value) {
		
		this.suit = suit;
		this.value = value;
	}
	public String getSuit() {
		return suit;
	}
	public void setSuit(String suit) {
		this.suit = suit;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return value +" of " + suit;
	}
	
	
}
