package bean;

import java.util.Objects;

public class Dish {
	// internal enum in class
	public enum Kind {
		MEAT, FISH, OTHER
	}
	
	private String id;	
	private String name;
	private double calories;
	private Kind kind;
	private boolean vegetarian;
	
	public Dish() {
	}

	public Dish(String id, String name, double calories, Kind kind, boolean vegetarian) {
		super();
		this.id = id;
		this.name = name;
		this.calories = calories;
		this.kind = kind;
		this.vegetarian = vegetarian;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}

	public Kind getKind() {
		return kind;
	}

	public void setKind(Kind kind) {
		this.kind = kind;
	}

	public boolean isVegetarian() {
		return vegetarian;
	}

	public void setVegetarian(boolean vegetarian) {
		this.vegetarian = vegetarian;
	}

	@Override
	public String toString() {
		return "Dish [id=" + id + ", name=" + name + ", calories=" + calories + ", kind=" + kind + ", vegetarian="
				+ vegetarian + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Dish)) {
			return false;
		}
		Dish that = (Dish) obj;
		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
	public boolean distinctByKey(String key) {
		return id == key;
	}
	
	public static class NameCaloriesParaMeter {
		private String name;
		private double calories;
		
		public NameCaloriesParaMeter(String name, double calories) {
			this.name = name;
			this.calories = calories;
		}
		
		public String getName() {
			return name;
		}
		
		public void setName(String name) {
			this.name = name;
		}
		
		public double getCalories() {
			return calories;
		}
				
		public void setCalories(double calories) {
			this.calories = calories;
		}
		
		@Override
		public String toString() {
			return "Name: " + name + ", Calories: " + calories;
		}
	}
}
