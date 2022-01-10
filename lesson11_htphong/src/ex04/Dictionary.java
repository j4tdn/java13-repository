package ex04;

import java.util.List;

public class Dictionary {
	List<Word> dictionary;
	public Dictionary() {
		
	}
	public Dictionary(List<Word> dictionary) {
		this.dictionary = dictionary;
	}
	public void addWord(Word word) {
		dictionary.add(word);
	}
	public void showDictionary() {
		for(Word word : dictionary) {
			System.out.println(word);
		}
	}
	public void lookUp(String word) {
		for(Word w : dictionary) {
			if(w.getWord().equalsIgnoreCase(word)) {
				System.out.println(w);
			}
		}
	}
}
