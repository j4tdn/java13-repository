package persistence;

public class ItemGroupDto {
	private Integer id;
	private String name;
	private String listItem;
	private Integer amount;
	
	public ItemGroupDto() {
		
	}

	public ItemGroupDto(Integer id, String name, String listItem, Integer amount) {
		this.id = id;
		this.name = name;
		this.listItem = listItem;
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

	public String getListItem() {
		return listItem;
	}

	public void setListItem(String listItem) {
		this.listItem = listItem;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ItemGroupDto [id=" + id + ", name=" + name + ", listItem=" + listItem + ", amount=" + amount + "]";
	}
}	
