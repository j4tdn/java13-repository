package persistence;

public class ItemGroupDto {

	private Integer igID;
	private String igName;
	private String items;
	private Integer totalOfItems;
	
	public ItemGroupDto() {
	}

	
	public ItemGroupDto(Integer igID, String igName, String items, Integer totalOfItems) {
		this.igID = igID;
		this.igName = igName;
		this.items = items;
		this.totalOfItems = totalOfItems;
	}

	public Integer getIgID() {
		return igID;
	}

	public void setIgID(Integer igID) {
		this.igID = igID;
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
		return "ItemGroupDto [igID=" + igID + ", igName=" + igName + ", items=" + items + ", totalOfItems="
				+ totalOfItems + "]";
	}
	
	
}
