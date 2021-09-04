package enumeration;
/*
 * Enumeration: special class
 * consist of attribute, method, constructor
 * Consist of constant value (object of num), fixed- amount of value instie num
 */
public enum CirclePos {
	INSIDE("inside"),
	OUTSIDE("outside"),
	ONSIDE("onside");
	
	private String localized;
	
	CirclePos (String pLocalized){
		this.localized = pLocalized;
	}
	public String getLocalied() {
		return this.localized;
	}
	
	
	
	
	
}
	
	
