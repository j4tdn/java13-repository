package persistence;

import java.time.LocalTime;

/**
 * @author PC
 *
 */
public class SaledItems {
	private int id;
	private String name;
	private LocalTime time;
	
	public SaledItems() {
		// TODO Auto-generated constructor stub
	}

	public SaledItems(int id, String name, LocalTime time) {
		super();
		this.id = id;
		this.name = name;
		this.time = time;
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

	public LocalTime gettime() {
		return time;
	}

	public void settime(LocalTime time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "SaledItems [id=" + id + ", name=" + name + ", time=" + time + "]";
	}
	
	
}
