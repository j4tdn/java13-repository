package persistence;

/**
 * Role ==> Entity, 
 * Mapping, Receiving Data from Table LoaiHang
 */
public class ItemGroup {
	private Integer id;
	private String name;
	
	// OneToMany
	// private List<Item> items;
	
	public ItemGroup() {
	}

	public ItemGroup(Integer id, String name) {
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name + "]";
	}
}
