package bean;

public class Apple {
	private int id;
    private String color;
    
	public Apple() {
		
	}

	public Apple(int id, String color) {
		super();
		this.id = id;
		this.color = color;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Apple [id=" + id + ", color=" + color + "]";
	}
	
    
}
