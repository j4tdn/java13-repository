package ex02;

public class Disk {
	private int id;
	private String type;
	private String singer;
	private int number;
	private double price;

	public Disk() {
	}

	public Disk(int id, String type, String singer, int number, double price) {
		this.id = id;
		this.type = type;
		this.singer = singer;
		this.number = number;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Disk [id=" + id + ", type=" + type + ", singer=" + singer + ", number=" + number + ", price=" + price
				+ "]";
	}

}
