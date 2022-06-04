package persistence;

public class Item {
	private Integer id;
	private String name;
	private Integer totalOfAmount;
	
	public Item() {
		
	}

	public Item(Integer id, String name, Integer totalOfAmount) {
		super();
		this.id = id;
		this.name = name;
		this.totalOfAmount = totalOfAmount;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTotalOfAmount() {
		return totalOfAmount;
	}

	public void setTotalOfAmount(Integer totalOfAmount) {
		this.totalOfAmount = totalOfAmount;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", totalOfAmount=" + totalOfAmount + "]";
	}
	
}
