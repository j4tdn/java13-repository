package ex03;

public class Card {
	
	private int num;
	private String quality;
	
	public Card() {
		
	}
	
	public Card(int num, String quality) {
		this.num = num;
		this.quality = quality;
	}
	
	public void setNum(int num) {
		this.num = num;
	}

	public void setQuality(String quality) {
		this.quality = quality;
	}

	@Override
	public String toString() {
		return num + " " + quality;
	}
	
	

}
