package ex05;

public class Shopping {
	private Customer kh;
	private TextBook gk;
	private ReferBook tk;
	
	public Shopping() {
	}
	
	public Shopping(Customer kh, TextBook gk, ReferBook tk) {
		this.kh = kh;
		this.gk = gk;
		this.tk = tk;
	}

	public Customer getKh() {
		return kh;
	}


	public void setKh(Customer kh) {
		this.kh = kh;
	}


	public TextBook getGk() {
		return gk;
	}


	public void setGk(TextBook gk) {
		this.gk = gk;
	}


	public ReferBook getTk() {
		return tk;
	}


	public void setTk(ReferBook tk) {
		this.tk = tk;
	}


	public double totalprice2() {
		return gk.totalprice()+ tk.totalprice();
	}
	
	
}
