package model;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import bean.TypeWord;
import bean.Word;

public class WordData {
	private WordData() {
	}
	
	public static Map<String, Word> getAll() {
		Map<String, Word> words = new HashMap<String, Word>();
		words.put("Boy", new Word("Boy", "Chang trai", TypeWord.NOUN, "+"));
		words.put("Girl", new Word("Girl", "Co Gai", TypeWord.NOUN, "+"));
		words.put("Play", new Word("Play", "Choi", TypeWord.VERB, "-"));
		words.put("Relax", new Word("Relax", "Thu gian", TypeWord.VERB, "-"));
		words.put("Beautiful", new Word("Beautiful", "Xinh Dep", TypeWord.ADJ, "x"));
		words.put("Kind", new Word("Kind", "Tu Te", TypeWord.ADJ, "x"));
		return words;
	}
	
	public static void print(Map<String, Word> words) {
		for (Entry<String, Word> word : words.entrySet()) {
			System.out.println(word.getKey());
			System.out.println(word.getValue());
			System.out.println("=======================");
		}
	}
}
