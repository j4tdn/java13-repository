package enumeration;

public enum CirclePos {
	//default >>  public static final
	INSIDE("inside"), ONSIDE("onside"), OUTSIDE("outside"), OFSIDE;
	
	
	//attribute
	private String localized;
	
	CirclePos() {
		
	}
	
	//default >> private
	CirclePos(String localized) {
		this.localized = localized;
	}
	
	
	public String getLocalized() {
		return this.localized;
	}
}
