package persistence;

public class ItemGroup {
	private Integer id;
	private String name;
	private Integer amount;

	public ItemGroup() {
	}

	public ItemGroup(Integer id, String name, Integer amount) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
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

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ItemGroupAmount [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}
}