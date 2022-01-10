package Ex02;

public class CD {
	private int MaCD;
	private String typeCD;
	private String Singer;
	private int singNumbers;
	private float price;
	
	public CD() {
		
	}

	public CD(int maCD, String typeCD, String singer, int singNumbers, float price) {
		super();
		MaCD = maCD;
		this.typeCD = typeCD;
		Singer = singer;
		this.singNumbers = singNumbers;
		this.price = price;
	}
	
	public int getMaCD() {
		return MaCD;
	}

	public void setMaCD(int maCD) {
		MaCD = maCD;
	}

	public String getTypeCD() {
		return typeCD;
	}

	public void setTypeCD(String typeCD) {
		this.typeCD = typeCD;
	}

	public String getSinger() {
		return Singer;
	}

	public void setSinger(String singer) {
		Singer = singer;
	}

	public int getSingNumbers() {
		return singNumbers;
	}

	public void setSingNumbers(int singNumbers) {
		this.singNumbers = singNumbers;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CD [MaCD=" + MaCD + ", typeCD=" + typeCD + ", Singer=" + Singer + ", singNumbers=" + singNumbers
				+ ", price=" + price + "]";
	}

}
