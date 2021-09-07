package enumration;

public enum CirclePos {
	INSIDE("inside"),
	
	OUTSIDE("outside"),
	
	ONSIDE("inside");
	
	public String localized;
	
	CirclePos(String pLocalized){
		this.localized = pLocalized;
	}
}
