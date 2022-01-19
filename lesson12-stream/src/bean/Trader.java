package bean;

public class Trader {
	private int id;
	private String name;
	private String country;

	public Trader() {
	}

	public Trader(String line) {
		String[] elements = line.split(", ");
		if (elements.length == 3) {
			this.id = Integer.parseInt(elements[0]);
			this.name = elements[1];
			this.country = elements[2];
		}
	}
	public static Trader transfer(String line) {
		Trader trader = null;
		String[] elements = line.split(", ");
		if (elements.length == 3) {
			trader = new Trader(Integer.parseInt(elements[0]), elements[1], elements[2]);
		}
		return trader;
	}
	public Trader(int id, String name, String country) {
		super();
		this.id = id;
		this.name = name;
		this.country = country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Trader [id=" + id + ", name=" + name + ", country=" + country + "]";
	}

}
