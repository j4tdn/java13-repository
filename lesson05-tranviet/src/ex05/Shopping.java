package ex05;

public class Shopping {
	private Customer cs;
	private ReferenceBook[] rbs;
	private TextBook[] tbs;

	public Shopping() {
	}

	public Shopping(Customer cs, ReferenceBook[] rbs, TextBook[] tbs) {
		this.cs = cs;
		this.rbs = rbs;
		this.tbs = tbs;
	}

	public Customer getCs() {
		return cs;
	}

	public void setCs(Customer cs) {
		this.cs = cs;
	}

	public ReferenceBook[] getRbs() {
		return rbs;
	}

	public void setRbs(ReferenceBook[] rbs) {
		this.rbs = rbs;
	}

	public TextBook[] getTbs() {
		return tbs;
	}

	public void setTbs(TextBook[] tbs) {
		this.tbs = tbs;
	}

}
