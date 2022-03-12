package bean;

public class Apple {
	private int id;
    private String color;
    
    public Apple() {
    	System.out.println("\n>>>> Apple 00");
	}

    public Apple(String line) {
    	String[] elements = line.split("[\\s-\\s]+");
    	if (elements.length == 2) {
    		this.id = Integer.parseInt(elements[0]);
    		this.color = elements[1];
    	}
    }
    
	public Apple(int id, String color) {
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
