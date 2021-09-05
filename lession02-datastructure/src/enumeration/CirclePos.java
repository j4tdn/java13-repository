package enumeration;

public enum CirclePos {
	INSIDE("inside"),
	ONSIDE("onside"),
	OUTSIDE("outside");
	
	private String localized;
	
	CirclePos(String plocalized) {
		this.localized = plocalized;
	}
	public String getlocalized() {
		return this.localized;
	}
}
