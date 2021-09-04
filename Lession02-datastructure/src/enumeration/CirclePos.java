package enumeration;


/**
 * Enumertion : specical class
 * consist of attributes, methods, contructor
 * Consists of constant value(object of enum), fixed -amount of value inside enum
 * Cannot initial new enum value(object) external >> private constructor
 * 
 * INSIDE, // same as Circle INSIDE = new CirclePos() >< no attribute
 * INSIDE("inside"), //same as Circle INSIDE = new Circle (inside);
 *Locallized data
 */
public enum CirclePos {
	
	INSIDE("inside"),
	ONSIDE("onside"),
	OUTSIDE("outside");
	
	//attribute
	private String localized;
	
	//mặc định là private
	CirclePos(String pLocalized) {
		this.localized = pLocalized;
	}
	public String getlocalized() {
		return this.localized;
	}
	
}
