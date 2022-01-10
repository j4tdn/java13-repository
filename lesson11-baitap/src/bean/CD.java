package bean;

import java.util.Objects;

public class CD {
	int cDCode;
	String cDType;
	String singer;
	int numberSong;
	Double price;
	
	public CD() {
	}

	public CD(int cDCode, String cDType, String singer, int numberSong, Double price) {
		this.cDCode = cDCode;
		this.cDType = cDType;
		this.singer = singer;
		this.numberSong = numberSong;
		this.price = price;
	}

	public int getcDCode() {
		return cDCode;
	}

	public void setcDCode(int cDCode) {
		this.cDCode = cDCode;
	}

	public String getcDType() {
		return cDType;
	}

	public void setcDType(String cDType) {
		this.cDType = cDType;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public int getNumberSong() {
		return numberSong;
	}

	public void setNumberSong(int numberSong) {
		this.numberSong = numberSong;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof CD)) {
			return false;
		}
		
		CD that = (CD)o;
		
		return getcDCode() == that.getcDCode();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getcDCode());
	}
	
	@Override
	public String toString() {
		return "CD [cDCode=" + cDCode + ", cDType=" + cDType + ", singer=" + singer + ", numberSong=" + numberSong
				+ ", price=" + price + "]";
	}
	
}
