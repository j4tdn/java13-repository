package bean;

public class Trader {
	private int id;
	private String name;
	private String city;

	public Trader(String line) {
		String[] elements = line.split(", ");
		if (elements.length == 3) {
			this.id = Integer.parseInt(elements[0]);
			this.name = elements[1];
			this.city = elements[2];
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
	
	public Trader(String name, String city) {
		this.name = name;
		this.city = city;
	}

	public Trader(int id, String name, String city) {
		this.id = id;
		this.name = name;
		this.city = city;
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

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Trader [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
}
