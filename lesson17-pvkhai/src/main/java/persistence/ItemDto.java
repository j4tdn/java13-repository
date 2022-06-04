package persistence;

import java.time.LocalTime;

public class ItemDto {
	private Integer id;
	private String name;
	private LocalTime time;
	public ItemDto(Integer id, String name, LocalTime time) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
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
	public LocalTime getTime() {
		return time;
	}
	public void setTime(LocalTime time) {
		this.time = time;
	}
	@Override
	public String toString() {
		return "ItemDto [id=" + id + ", name=" + name + ", time=" + time + "]";
	}
	
	
}
