package training;

public enum WeekDay {
	MONDAY("Thứ 2"),
	TUESDAY("Thứ 3"),
	WEDNESDAY("Thứ 4"),
	THURSDAY("Thứ 5"),
	FRIDAY("Thứ 6"),
	SATURDAY("Thứ 7");
	
	private String value;
	
	WeekDay(String value) {
		System.err.println(("This constructor is: " + value));
		this.value = value;
	}
	
	public static WeekDay getDayByString(String value) {
		for(WeekDay d : WeekDay.values()) {
			if(d.value == value) {
				return d;
			}
		}
		return null;
	}
}

