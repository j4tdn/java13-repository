package structure;

public enum Levels {
	GOOD("Gioi"),
	PRETTY_GOOD("Kha"),
	MEDIUM("Trung Binh"),
	BAD("Yeu");
	public String value;
	
	private Levels(String pvalue ) {
		this.value = pvalue;
	}
	
	
}
