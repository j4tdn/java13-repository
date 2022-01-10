package ex04;

public class Dictionary {
	private String word;
	private String means;
	private String wordType;
	private String note;
	
	public Dictionary() {
		// TODO Auto-generated constructor stub
	}

	public Dictionary(String word, String means, String wordType, String note) {
		super();
		this.word = word;
		this.means = means;
		this.wordType = wordType;
		this.note = note;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMeans() {
		return means;
	}

	public void setMeans(String means) {
		this.means = means;
	}

	public String getWordType() {
		return wordType;
	}

	public void setWordType(String wordType) {
		this.wordType = wordType;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		
		if(obj == null) {
			return false;
		}
		
		Dictionary that = (Dictionary)obj;
		
		return this.getWord() == that.getWord();
	}

	@Override
	public String toString() {
		return "Dictionary [word=" + word + ", means=" + means + ", wordType=" + wordType + ", note=" + note + "]\n";
	}
	
}
