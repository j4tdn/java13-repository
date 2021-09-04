


package enumeration;

/** 
 * Enumeration: special class 
 * Consist of attributes, methods, constructors
 * Consist of constant value(object of enum), fixed-amount of value inside enum
 * Cannot intial new enumber value(object) external >> private constructor
 * 
 * INSIDE, // same as Circle INSIDE = new CirclePos() >< no attribute
 * INSIDE("inside"), // same as Circle INSIDE = new CirclePos("inside") >< has attribute
 * Localized data 
 */

public enum CirclePos {
	// default >> public static final
	INSIDE("inside"), // hằng số ko đổi > ko thể update giá trị
	ONSIDE("onside"), 
	OUTSIDE("outside");
	
	// attribute
	private String localized; // Enum > ko update value > set là "private"
	
	// default >> private
	CirclePos(String pLocalized) { // = private CirclePos() >đối với hàm Enum mặc định là private nên ko cần type
		this.localized = pLocalized;
	}
	
	public String getLocalized() {
		return this.localized; // Hàm này chỉ hỗ trợ get value; (line 32_CirclePos.java)
	}
	
}
