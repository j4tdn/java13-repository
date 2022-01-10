package Ex04;

public class Words {
	private String word;
	private String mean;
	private String type;
	private String note;
	
	public Words() {
	}

	public Words(String word, String mean, String type, String note) {
		super();
		this.word = word;
		this.mean = mean;
		this.type = type;
		this.note = note;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMean() {
		return mean;
	}

	public void setMean(String mean) {
		this.mean = mean;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "Word [word=" + word + ", mean=" + mean + ", type=" + type + ", note=" + note + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(!(obj instanceof Words)) {
			return false;
		}
		Words that = (Words)obj;
		return that.getMean().toLowerCase().equals(getMean().toLowerCase());
	}
	
	
	

}
