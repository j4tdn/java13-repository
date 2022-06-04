package persistence;

public class ItemGroupDto {
	private Integer igID;
	private String igName;
	private Integer totalOfItems;
	
	public ItemGroupDto() {
	}

	
	public ItemGroupDto(Integer igID, String igName, Integer totalOfItems) {
		this.igID = igID;
		this.igName = igName;
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

	public Integer getTotalOfItems() {
		return totalOfItems;
	}

	public void setTotalOfItems(Integer totalOfItems) {
		this.totalOfItems = totalOfItems;
	}

	@Override
	public String toString() {
		return "ItemGroupDto [igID=" + igID + ", igName=" + igName + ", totalOfItems="
				+ totalOfItems + "]";
	}
}
