package enumeration;
/**
 * 
 * Enumeration: special class
 * Consist of attributes, methods, constructor
 * Consists of constant value(object of enum), fixed-amount of value inside enum
 * Cannot initial new enum value(object) external >> private constructor
 * 
 * INSIDE, // same as Circle INSIDE = new CirclePos() >< no attribute
 * INSIDE("inside"), // same as Circle INSIDE = new CirclePos() >< no attribute
 * Localized
 *
 */
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
