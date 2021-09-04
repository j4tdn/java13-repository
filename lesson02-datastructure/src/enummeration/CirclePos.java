package enummeration;

public enum CirclePos {
		INSIDE("inside"),
		ONSIDE("onside"),
		OUTSIDE("outside");
	
	private String localized;
	
	CirclePos(String pLocalized){
		this.localized = pLocalized;
	}
}
