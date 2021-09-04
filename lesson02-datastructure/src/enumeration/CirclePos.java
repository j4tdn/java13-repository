package enumeration;



public enum CirclePos {
	INSIDE("inside"),
	ONSIDE("onside"),
	OUTSIDE("outside");
	
	// attribute
	private String localized;
	
	CirclePos(String localized) {
		this.localized = localized;
	}
	
	public String getLocalized() {
		return this.localized;
	}
}
