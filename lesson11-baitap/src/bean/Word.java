package bean;

import java.util.Objects;

public class Word {
	String word;
	String means;
	String wordType;
	String note;
	
	public Word() {
	}

	public Word(String word, String means, String wordType, String note) {
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
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Word)) {
			return false;
		}
		
		Word that = (Word)o;
		
		return getWord().equals(that.getWord());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getWord());
	}
	
	@Override
	public String toString() {
		return "Word [word=" + word + ", means=" + means + ", wordType=" + wordType + ", note=" + note + "]";
	}
	
	
}
