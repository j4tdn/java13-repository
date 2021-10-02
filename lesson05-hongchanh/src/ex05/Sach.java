package ex05;

public class Sach {
	protected String ma;
	protected int dongia;
	protected String nxb;
	
	public Sach() {
		
	}
	
	public Sach(String ma, int dongia, String nxb) {
		this.ma=ma;
		this.dongia=dongia;
		this.nxb=nxb;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public int getDongia() {
		return dongia;
	}

	public void setDongia(int dongia) {
		this.dongia = dongia;
	}

	public String getNxb() {
		return nxb;
	}

	public void setNxb(String nxb) {
		this.nxb = nxb;
	}
}
