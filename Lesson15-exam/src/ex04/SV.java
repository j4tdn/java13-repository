package ex04;

public class SV {
	private String MSSV;
	private String Name;
	private String Dtb;
	private String Sex;
	
	public SV() {
		// TODO Auto-generated constructor stub
	}

	public SV(String mSSV, String name, String dtb, String sex) {
		MSSV = mSSV;
		Name = name;
		Dtb = dtb;
		Sex = sex;
	}

	public String getMSSV() {
		return MSSV;
	}

	public void setMSSV(String mSSV) {
		MSSV = mSSV;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getDtb() {
		return Dtb;
	}

	public void setDtb(String dtb) {
		Dtb = dtb;
	}

	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}
	
}
