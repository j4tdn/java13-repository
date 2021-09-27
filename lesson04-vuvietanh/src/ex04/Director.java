package ex04;

public class Director extends People {
	private double heSoChucVu;
	
	public Director() {
	
	}

	public Director(String name, int namSinh, double heSoLuong,double heSoChucVu) {
		super(name,namSinh, heSoLuong );
		this.heSoChucVu = heSoChucVu;
	}

	public double getHeSoChucVu() {
		return heSoChucVu;
	}

	public void setHeSoChucVu(double heSoChucVu) {
		this.heSoChucVu = heSoChucVu;
	}

	@Override
	double salary() {
		
		return (getHeSoLuong() + heSoChucVu) * 3000000;
	}

	@Override
	public String toString() {
		return getName() + "\t" + getNamSinh() + "\t" + getHeSoLuong() +"\t" + heSoChucVu +"\t" + salary();
	}
	
	
}
	