package ex04;

public class Word {
	private String word;
	private String mean;
	private WordType wordType;
	private String node;
	
	public Word() {
		
	}

	public Word(String word, String mean, WordType wordType, String note) {
		this.word = word;
		this.mean = mean;
		this.wordType = wordType;
		this.node = note;
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

	public WordType getWordType() {
		return wordType;
	}

	public void setWordType(WordType wordType) {
		this.wordType = wordType;
	}

	public String getNote() {
		return this.node;
	}

	public void setNote(String note) {
		this.node = note;
	}

	@Override
	public String toString() {
		return "\nWord [word=" + word + ", mean=" + mean + ", wordType=" + wordType + ", Note=" + node + "]";
	}
	
	
}
