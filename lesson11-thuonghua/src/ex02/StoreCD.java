package ex02;

public class StoreCD implements Comparable<StoreCD>{
	private int id;
	private String nameCD;
	private String singer;
	private int numberOfSongs;
	private float price;
	
	public StoreCD() {
		// TODO Auto-generated constructor stub
	}

	public StoreCD(int id, String nameCD, String singer, int numberOfSongs, float price) {
		super();
		this.id = id;
		this.nameCD = nameCD;
		this.singer = singer;
		this.numberOfSongs = numberOfSongs;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNameCD() {
		return nameCD;
	}

	public void setNameCD(String nameCD) {
		this.nameCD = nameCD;
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
		this.numberOfSongs = numberOfSongs;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	
	private int compare(StoreCD that) {
		return this.getNameCD().compareTo(that.getNameCD());
	}
	
	@Override
    public int compareTo(StoreCD student) {
        // sort student's name by ASC
        return this.getNameCD().compareTo(student.getNameCD());
    }

	@Override
	public String toString() {
		return "StoreCD [id=" + id + ", nameCD=" + nameCD + ", singer=" + singer + ", numberOfSongs=" + numberOfSongs
				+ ", price=" + price + "]\n";
	}
	
	
}
