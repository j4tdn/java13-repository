package persistence;

public class ItemDto {
	private ItemGroup itemGroup;
	private Integer id;
	private String name;
	private Integer sellPrice;
	private Integer buyPrice;
	private Integer quantity;
	
	public ItemDto() {
		
	}

	public ItemDto(ItemGroup itemGroup, Integer id, String name, Integer sellPrice, Integer buyPrice,
			Integer quantity) {
		this.itemGroup = itemGroup;
		this.id = id;
		this.name = name;
		this.sellPrice = sellPrice;
		this.buyPrice = buyPrice;
		this.quantity = quantity;
	}

	public ItemGroup getItemGroup() {
		return itemGroup;
	}

	public void setItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
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

	public Integer getSellPrice() {
		return sellPrice;
	}

	public void setSellPrice(Integer sellPrice) {
		this.sellPrice = sellPrice;
	}

	public Integer getBuyPrice() {
		return buyPrice;
	}

	public void setBuyPrice(Integer buyPrice) {
		this.buyPrice = buyPrice;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "ItemDto [itemGroup=" + itemGroup + ", id=" + id + ", name=" + name + ", sellPrice=" + sellPrice
				+ ", buyPrice=" + buyPrice + ", quantity=" + quantity + "]";
	}
	
	
}
