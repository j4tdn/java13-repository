package package2;

// Builder Pattern
public class AgeRange {
	private Integer min;
	private Integer max;
	
	private AgeRange() {
		
	}
	
	public static AgeRange init(int min) {
		return new AgeRange().min(min);
	}
	
	public static AgeRange init(int min, int max) {
		return new AgeRange().min(min).max(max);
	}
	
	public AgeRange min(int min) {
		this.min = min;
		return this;
	}
	
	public AgeRange max(int max) {
		this.max = max;
		return this;
	}

	public Integer getMin() {
		return min;
	}

	public Integer getMax() {
		return max;
	}
	
	public boolean contains(int age) {
		return (max == null && age >= min) || (age >= min && age <= max);
	}
}
