package ex02;

public class CD  {
	int code;
	String type;
	String singer;
	int songQuantity;
	double price;
	public CD() {}
	public CD(int code, String type, String singer, int songQuantity, double price) {
		this.code = code;
		this.type = type;
		this.singer = singer;
		this.songQuantity = songQuantity;
		this.price = price;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public int getSongQuantity() {
		return songQuantity;
	}
	public void setSongQuantity(int songQuantity) {
		this.songQuantity = songQuantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
