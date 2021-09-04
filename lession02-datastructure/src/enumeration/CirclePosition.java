package enumeration;

/**
 * 
 * Enumeration: special class
 * Consist of attributes, methods, constructor
 * Consists of constant value(object of enum), fixed-amount of value inside enum
 *	Cannot initial new enum object external >> because it has private constructor
 *
 * Localize data 
 */

public enum CirclePosition {
	// public static 
	INSIDE("inside"), // same as CirclePostion INSIDE = new CirclePosition() >< no attribute
	ONSIDE("onside"),
	OUTSIDE("outside");
	
	// Attribute
	private String localized;
	
	// default >> private
	CirclePosition(String localized) {
		this.localized = localized;
	}
	
	public String getLocalized() {
		return localized;
	}
}
