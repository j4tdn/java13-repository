package bean;

public class Apple {
	private int id;
	private String color;

	public Apple() {
	}

	public Apple(int id, String color) {
		this.id = id;
		this.color = color;
	}

	public Apple(String line) {
		String[] elements = line.split("[\\s-\\s]+");
		if (elements.length == 2) {
			this.id = Integer.parseInt(elements[0]);
			this.color = elements[1];
		}
	}
	@Override
	public String toString() {
		return this.id + ", " + this.color;
	}
}
