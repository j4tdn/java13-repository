package ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class App {
	public static void main(String[] args) {
		Map<String, Word> dictionary = mockDictionary();
		
		//add dictionary		
		dictionary.put("Easy", new Word("easy", "dễ dàng", WordType.ADJ, "không khó"));
		
	
		
		search("Easy", dictionary);
		search("Family", dictionary);
		
		
	}
	
	private static void search(String word, Map<String, Word> dictionary){
		
		System.out.println(dictionary.get(word));
	
	}
	
	private static Map<String, Word> mockDictionary(){
		
		Map<String, Word> dictionaries = new HashMap<>();
		
		dictionaries.put("School", new Word("school", "trường học", WordType.NOUNS, "ngôi trường"));
		dictionaries.put("Family", new Word("family", "gia đình", WordType.NOUNS, "gia đình"));
		dictionaries.put("Create", new Word("create", "tạo ra", WordType.VERB, "tạo ra"));
		dictionaries.put("Comfortable", new Word("comfortable", "thoải mái", WordType.ADJ, "thoải mái"));
		dictionaries.put("Before", new Word("before", "trước khi", WordType.ADV, "lúc trước"));
		
		return dictionaries;

	}
}	
