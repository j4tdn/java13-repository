package ex04;

public class Manager extends People {
	private int soLuongQL;
	
	public Manager() {
		
	}

	public Manager(String name, int namSinh, double heSoLuong,int soLuongQL) {
		super(name,namSinh, heSoLuong);
		this.soLuongQL = soLuongQL;
	}

	public int getSoLuongQL() {
		return soLuongQL;
	}

	public void setSoLuongQL(int soLuongQL) {
		this.soLuongQL = soLuongQL;
	}

	@Override
	double salary() {
		
		return getHeSoLuong() * 2200000;
	}

	@Override
	public String toString() {
		return getName() + "\t" + getNamSinh() + "\t" + getHeSoLuong()  +"\t" + soLuongQL +"\t    " + salary();
	}
	
	
	
	
}
