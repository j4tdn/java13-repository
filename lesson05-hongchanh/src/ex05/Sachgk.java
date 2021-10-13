package ex05;

public class Sachgk extends Sach {
	private boolean tinhtrang;
	
	public Sachgk() {
		
	}
	
	public Sachgk(String ma, int dongia, String nxb, boolean tinhtrang) {
		super(ma, dongia, nxb);
		this.tinhtrang=tinhtrang;
	}

	public boolean isTinhtrang() {
		return tinhtrang;
	}

	public void setTinhtrang(boolean tinhtrang) {
		this.tinhtrang = tinhtrang;
	}
	
	@Override
	public String toString() {
		return " "+ ma+ " " + dongia + " " +nxb+ " "+tinhtrang ;
	}
	
}
