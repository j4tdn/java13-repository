package ex03;

public class Cards {
	private String type;
	private String aces;
	
	public Cards() {
		// TODO Auto-generated constructor stub
	}

	public Cards(String type, String aces) {
		super();
		this.type = type;
		this.aces = aces;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getAces() {
		return aces;
	}

	public void setAces(String aces) {
		this.aces = aces;
	}

	@Override
	public String toString() {
		return type + "." + aces  ;
	}
	
}	
