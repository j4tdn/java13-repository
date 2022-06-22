package persistence;

public class ItemGroupDto {
	
	public static final String ITEM_GROUP_ID = "igId";
	public static final String ITEM_GROUP_NAME = "igName";
	public static final String ITEMS = "items";
	public static final String TOTAL_OF_ITEMS = "totalOfItems";
	
	private Integer igId;
	private String igName;
	private String items;
	private Integer totalOfItems;
	
	public ItemGroupDto() {
	}

	public ItemGroupDto(Integer igId, String igName, String items, Integer totalOfItems) {
		this.igId = igId;
		this.igName = igName;
		this.items = items;
		this.totalOfItems = totalOfItems;
	}

	public Integer getIgId() {
		return igId;
	}

	public void setIgId(Integer igId) {
		this.igId = igId;
	}

	public String getIgName() {
		return igName;
	}

	public void setIgName(String igName) {
		this.igName = igName;
	}

	public String getItems() {
		return items;
	}

	public void setItems(String items) {
		this.items = items;
	}

	public Integer getTotalOfItems() {
		return totalOfItems;
	}

	public void setTotalOfItems(Integer totalOfItems) {
		this.totalOfItems = totalOfItems;
	}

	@Override
	public String toString() {
		return "ItemGroupDto [igId=" + igId + ", igName=" + igName + ", items=" + items + ", totalOfItems="
				+ totalOfItems + "]";
	}
}
