package bean;

import java.util.Objects;

import exception.InvalidPrice;

public class CD implements Comparable<CD> {
	private int id;
	private String type;
	private String singer;
	private int numberOfSongs;
	private double price;

	public CD() {
	}

	public CD(int id, String type, String singer, int numberOfSongs, double price) {
		this.id = id;
		this.type = type;
		this.singer = singer;
		this.numberOfSongs = isValidNumberOfSongs(numberOfSongs);
		this.price = isValidPrice(price);
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

	public int getNumberOfSongs() {
		return numberOfSongs;
	}

	public void setNumberOfSongs(int numberOfSongs) {
		this.numberOfSongs = isValidNumberOfSongs(numberOfSongs);
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = isValidPrice(price);
	}

	private double isValidPrice(double price) {
		if (price <= 0) {
			throw new InvalidPrice("CD's Price must be greater than 0");
		}
		return price;
	}

	private int isValidNumberOfSongs(int numberOfSongs) {
		if (numberOfSongs <= 0) {
			throw new NumberFormatException("NumberOfSongs must be greater than 0");
		}
		return numberOfSongs;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof CD)) {
			return false;
		}

		CD that = (CD) obj;

		return getId() == that.getId();
	}

	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}

	@Override
	public int compareTo(CD o) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "CD [id=" + id + ", type=" + type + ", singer=" + singer + ", numberOfSongs=" + numberOfSongs
				+ ", price=" + price + "]";
	}
}
