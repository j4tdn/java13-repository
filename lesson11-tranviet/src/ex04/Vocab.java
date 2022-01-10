package ex04;

public class Vocab {
	private String word;
	private String meaning;
	private WordType type;
	private String note;

	public Vocab() {
	}

	public Vocab(String word, String meaning, WordType type, String note) {
		this.word = word;
		this.meaning = meaning;
		this.type = type;
		this.note = note;
	}

	public String getWord() {
		return word;
	}

	public void setWord(String word) {
		this.word = word;
	}

	public String getMeaning() {
		return meaning;
	}

	public void setMeaning(String meaning) {
		this.meaning = meaning;
	}

	public WordType getType() {
		return type;
	}

	public void setType(WordType type) {
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
		return "Vocab [word=" + word + ", meaning=" + meaning + ", type=" + type + ", note=" + note + "]";
	}

}
