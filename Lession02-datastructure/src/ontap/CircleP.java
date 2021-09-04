package ontap;

public enum CircleP {
	ONSIDE("o tren"),
	OUTSIDE("o ngoai"),
	INSIDE("o trong");
	
	public String value;

	private CircleP(String getvalue) {
		this.value = getvalue;
	}
}
