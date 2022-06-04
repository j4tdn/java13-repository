package persistence;

public class ItemGroupDto {
	private Integer ItemGroupId;
	private String nameGroupItem;
	private Integer ItemId;
	private String nameItem;
	private double price;
	private double purchase;
	private Integer amount;
	
	public ItemGroupDto() {
		
	}

	public ItemGroupDto(Integer itemGroupId, String nameGroupItem, Integer itemId, String nameItem, double price,
			double purchase, Integer amount) {
		super();
		ItemGroupId = itemGroupId;
		this.nameGroupItem = nameGroupItem;
		ItemId = itemId;
		this.nameItem = nameItem;
		this.price = price;
		this.purchase = purchase;
		this.amount = amount;
	}

	public Integer getItemGroupId() {
		return ItemGroupId;
	}

	public void setItemGroupId(Integer itemGroupId) {
		ItemGroupId = itemGroupId;
	}

	public String getNameGroupItem() {
		return nameGroupItem;
	}

	public void setNameGroupItem(String nameGroupItem) {
		this.nameGroupItem = nameGroupItem;
	}

	public Integer getItemId() {
		return ItemId;
	}

	public void setItemId(Integer itemId) {
		ItemId = itemId;
	}

	public String getNameItem() {
		return nameItem;
	}

	public void setNameItem(String nameItem) {
		this.nameItem = nameItem;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPurchase() {
		return purchase;
	}

	public void setPurchase(double purchase) {
		this.purchase = purchase;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "ItemGroupDto [ItemGroupId=" + ItemGroupId + ", nameGroupItem=" + nameGroupItem + ", ItemId=" + ItemId
				+ ", nameItem=" + nameItem + ", price=" + price + ", purchase=" + purchase + ", amount=" + amount + "]";
	}
	
}
