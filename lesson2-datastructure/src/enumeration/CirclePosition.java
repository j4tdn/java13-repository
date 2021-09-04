package enumeration;

public enum CirclePosition {
	INSIDE("inside"),
	ONSIDE("onside"),
	OUTSIDE("outside");
	
	//attribute
	private String localize;

	CirclePosition(String pLocalized){
		this.localize = pLocalized;
	}

	public String getLocalize() {
		return this.localize;
	}
	
}
