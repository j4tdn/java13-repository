package ex02;

public class CD {
	private int idCD;
	private String typeCD;
	private String singer;
	private int amountSong;
	private double price;
	
	public CD() {
		
	}

	public CD(int idCD, String typeCD, String singer, int amountSong, double price) {
		this.idCD = idCD;
		this.typeCD = typeCD;
		this.singer = singer;
		this.amountSong = amountSong;
		this.price = price;
	}

	public int getIdCD() {
		return idCD;
	}

	public void setIdCD(int idCD) {
		this.idCD = idCD;
	}

	public String getTypeCD() {
		return typeCD;
	}

	public void setTypeCD(String typeCD) {
		this.typeCD = typeCD;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getAmountSing() {
		return amountSong;
	}

	public void setAmountSing(int amountSing) {
		this.amountSong = amountSing;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "CD [idCD=" + idCD + ", typeCD=" + typeCD + ", singer=" + singer + ", amountSing=" + amountSong
				+ ", price=" + price + "]";
	}
	
	
}