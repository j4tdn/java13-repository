package javaot.bean;

import java.util.List;

public class Item {
	private Integer id;
	private String name;
	private ItemGroup itemGroup;
	private List<String> providers;

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

	public ItemGroup getItemGroup() {
		return itemGroup;
	}

	public void setItemGroup(ItemGroup itemGroup) {
		this.itemGroup = itemGroup;
	}

	public List<String> getProviders() {
		return providers;
	}

	public void setProviders(List<String> providers) {
		this.providers = providers;
	}

	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", itemGroup=" + itemGroup + ", providers=" + providers + "]";
	}
}
