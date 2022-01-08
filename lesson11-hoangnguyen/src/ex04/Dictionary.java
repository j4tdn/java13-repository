package ex04;

import java.util.Objects;

public class Dictionary {
	private String word;
	private String meaning;
	private String wordType;
	private String note;
	
	public Dictionary() {
		
	}

	public Dictionary(String word, String meaning, String wordType, String note) {
		this.word = word;
		this.meaning = meaning;
		this.wordType = wordType;
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
		if(this == obj) return true;
		
		if(!(obj instanceof Dictionary)) return false;
		
		Dictionary that = (Dictionary)obj;
		
		return getWord().equalsIgnoreCase(that.getWord());
	}
	
	@Override
	public int hashCode() {
		return Objects.hashCode(getWord());
	}

	@Override
	public String toString() {
		return "Dictionary [word=" + word + ", meaning=" + meaning + ", wordType=" + wordType + ", note=" + note + "]";
	}
	
	
}
