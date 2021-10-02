package ex05;

public class Sachtk extends Sach{
	
private int thue;
	
	public Sachtk() {
		
	}
	
	public Sachtk(String ma, int dongia, String nxb, int thue) {
		super(ma, dongia, nxb);
		this.thue=thue;
	}

	public int getThue() {
		return thue;
	}

	public void setThue(int thue) {
		this.thue = thue;
	}

	@Override
		public String toString() {
			// TODO Auto-generated method stub
			return " "+ ma+ " " + dongia + " " +nxb+ " "+thue ;
		}
}
