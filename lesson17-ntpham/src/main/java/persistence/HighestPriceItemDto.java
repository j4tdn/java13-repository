package persistence;

public class HighestPriceItemDto {
	private Integer id;
	private String name;
	private String color;
	private Integer ItemGroupId;
	private Integer Price;
	
	public HighestPriceItemDto() {
	}

	public HighestPriceItemDto(Integer id, String name, String color, Integer itemGroupId, Integer price) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		ItemGroupId = itemGroupId;
		Price = price;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public Integer getItemGroupId() {
		return ItemGroupId;
	}

	public void setItemGroupId(Integer itemGroupId) {
		ItemGroupId = itemGroupId;
	}

	public Integer getPrice() {
		return Price;
	}

	public void setPrice(Integer price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "HighestPriceItemDto [id=" + id + ", name=" + name + ", color=" + color + ", ItemGroupId=" + ItemGroupId
				+ ", Price=" + Price + "]";
	}
}
