package enumeration;

public enum CirclePos {
	INSIDE("inside"),
	ONSIDE("onside"),
	OUTSIDE("outside");
	
	// attribute
	public String localized;
	
	CirclePos(String pLocalized) {
		this.localized = pLocalized;
	}
	public String getLocalized() {
		return this.localized;
	}
}
