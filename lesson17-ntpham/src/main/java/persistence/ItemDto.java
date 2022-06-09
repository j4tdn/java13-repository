package persistence;

import java.time.LocalTime;

public class ItemDto {
	private Integer id;
	private String name;
	private LocalTime saleDate;
	
	public ItemDto() {
		
	}

	public ItemDto(Integer id, String name, LocalTime saleDate) {
		this.id = id;
		this.name = name;
		this.saleDate = saleDate;
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

	public LocalTime getSaleDate() {
		return saleDate;
	}

	public void setSaleDate(LocalTime saleDate) {
		this.saleDate = saleDate;
	}

	@Override
	public String toString() {
		return "ItemDto [id=" + id + ", name=" + name + ", saleDate=" + saleDate + "]";
	}
}
