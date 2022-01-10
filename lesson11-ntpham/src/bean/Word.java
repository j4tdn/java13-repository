package bean;

import java.util.Objects;

public class Word {
	private String word;
	private String meaning;
	private TypeWord type;
	private String note;
	
	public Word() {
	}

	public Word(String word, String meaning, TypeWord type, String note) {
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

	public TypeWord getType() {
		return type;
	}

	public void setType(TypeWord type) {
		this.type = type;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof Word)) {
			return false;
		}
		
		Word that = (Word) obj;
		
		return getWord().equals(that.getWord()) 
				&& getMeaning().equals(that.getMeaning())
				&& getType() == that.getType()
				&& getNote().equals(that.getNote());
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getWord(), getMeaning(), getType(), getNote());
	}

	@Override
	public String toString() {
		return "Word [word=" + word + ", meaning=" + meaning + ", type=" + type + ", note=" + note + "]";
	}
}
