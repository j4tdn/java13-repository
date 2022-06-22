package persistence;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Role ==> Entity, 
 * Mapping, Receiving Data from Table MatHang
 */
@Entity
@Table(name = "MatHang")
public class Item {
	
	@Id
	@Column(name = "MaMH")
	private Integer id;
	
	@Column(name = "TenMH")
	private String name;
	
	@Column(name = "MauSac")
	private String color;
	
	// @ManyToOne(fetch = FetchType.EAGER)
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MaLH", referencedColumnName = "MaLH")
	private ItemGroup itemGroup;
	
	@OneToMany(mappedBy = "item")
	private List<ItemSizeRelation> itemSizeRelations;
	
	public Item() {
	}
	
	public Item(Integer id, String name, String color) {
		this.id = id;
		this.name = name;
		this.color = color;
	}

	public Item(Integer id, String name, String color, ItemGroup itemGroup) {
		this(id, name, color);
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
	
	public List<ItemSizeRelation> getItemSizeRelations() {
		return itemSizeRelations;
	}
	
	public void setItemSizeRelations(List<ItemSizeRelation> itemSizeRelations) {
		this.itemSizeRelations = itemSizeRelations;
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", color=" + color + ", ig=" + (itemGroup != null ? itemGroup : "") + "]";
	}
	
}
