/**
 * 
 */
package enumeration;

/**
 * Enumeration: special class
 * Consist of attributes, methods, constructor
 * Consists of constant value(object of enum), fixed-amount of value inside enum
 * Cannot initial new enum value(object) external >> private constructor 
 * 
 * INSIDE,           // same as Circle INSIDE = new CirclePos()         >< no attribute
 * INSIDE("inside"), // same as Circle INSIDE = new CirclePos("inside") >< has attribute
 * Localized data
 */
public enum CirclePos {
	// default >> public static final
	INSIDE("inside"), 
	ONSIDE("onside"), 
	OUTSIDE("outside");
	
	// attribute
	private String localized;
	
	// default >> private
	CirclePos(String pLocalized) {
		this.localized = pLocalized;
	}
	
	public String getLocalized() {
		return this.localized;
	}
}
