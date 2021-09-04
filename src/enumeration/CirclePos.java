package enumeration;

/*
 * Enumeration:special class
 * Consist of attributes,methods, constructor
 * Consists of constant value(obj of enum),fixed-amount of value inside enum
 * Cannot initial new enum value(obj) external>>private constructor
 * 
 * INSIDE,//same as Circle INSIDE = new CirclePos()><
 * INSIDE("inside")//same as Circle INSIDE = new CirclePos("inside)><
 * Localized data
 * */

public enum CirclePos {
	//public static final
	INSIDE("inside"),
	ONSIDE("onside"),
	OUTSIDE("outside");
	
	//attribute
	public String localized;
	
	//default>>private
	CirclePos(String pLocalized){
		this.localized = pLocalized;
	}
	
	public String getLocalized() {
		return this.localized;
	}
}
