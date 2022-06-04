package persistence;

public class Item {

	private int id;
	private String name;
	private String color;
	private ItemGroup itemGroup;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	public Item(Integer id, String name, String color) {
		this.id = id;
		this.name = name;
		this.color = color;
	}

	public Item(int id, String name, String color, ItemGroup itemGroup) {
		this(id,name,color);
		this.itemGroup = itemGroup;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public ItemGroup getItemGroup() {
		return itemGroup;
	}

	public void setItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", color=" + color + ", itemGroup=" + itemGroup + "]";
	}
	
	
}
