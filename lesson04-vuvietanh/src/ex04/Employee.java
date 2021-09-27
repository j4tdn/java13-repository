package ex04;

public class Employee extends People {
	private String tenDonVi;
	
	
	public Employee() {
		
	}


	public Employee(String name, int namSinh, double heSoLuong,String tenDonVi) {
		super(name, namSinh,heSoLuong);
		this.tenDonVi = tenDonVi;
	}


	public String getTenDonVi() {
		return tenDonVi;
	}


	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}


	@Override
	double salary() {
		
		return getHeSoLuong() * 125000;
	}


	@Override
	public String toString() {
		return getName() + "\t" + getNamSinh() + "\t" + getHeSoLuong()  +"\t" + tenDonVi +"\t" + salary();
	}
	
	
	
	
}
