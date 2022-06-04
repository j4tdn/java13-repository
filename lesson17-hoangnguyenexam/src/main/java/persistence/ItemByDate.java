package persistence;

import java.time.LocalTime;

public class ItemByDate {
	private Integer id;
	private String name;
	private LocalTime date;

	public ItemByDate() {

	}

	public ItemByDate(Integer id, String name, LocalTime date) {
		this.id = id;
		this.name = name;
		this.date = date;
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

	public LocalTime getDate() {
		return date;
	}

	public void setDate(LocalTime date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "ItemByDate [id=" + id + ", name=" + name + ", date=" + date + "]";
	}

}
