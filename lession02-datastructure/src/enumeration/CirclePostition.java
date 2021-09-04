package enumeration;
/*
 * Enumeration: special class
 * Consist of attributes, methods, constructors
 * Consist of constant value( Object of enum) external >> private constructor
 * Cannot initial new enum value external >> 
 * 
 * INSIDE: 						same as CirclePostition INSIDE = new CirclePostition();
 * INSIDE("Trong đường tròn"):  same as CirclePostition INSIDE = new CirclePostition("Trong đường tròn"); 
 * Localized
 * 
 */


public enum CirclePostition {
	
	//default: public static final
	INSIDE("Trong đường tròn"), 
	OUTSIDE("Ngoài đường tròn"),
	ONSIDE("Trên đường tròn");
	
	//attribute
	private final String localized;
	
	//default: private
	CirclePostition(String localized){
		this.localized = localized;
	}
	
	public String getLocalized() {
		return this.localized;
	}
	
}
