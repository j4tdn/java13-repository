package bai4;

public class Director extends People {
	private double HSCV;

	
	
	public Director(String name, int namSinh, double heSoLuong, double hSCV) {
		super(name, namSinh, heSoLuong);
		HSCV = hSCV;
	}

	public double getHSCV() {
		return HSCV;
	}

	public void setHSCV(double hSCV) {
		HSCV = hSCV;
	}
	public double luong() {
		 return (this.heSoLuong+this.HSCV)*3000000;
	 }
	@Override
	public String toString() {
		return "Director ["+" Name="+name+", Năm sinh="+namSinh+", Hệ số lương="+heSoLuong+", HSCV=" + HSCV + "]";
	}
	 
	
}
