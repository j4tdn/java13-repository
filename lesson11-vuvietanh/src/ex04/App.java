package ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class App {
	public static void main(String[] args) {
		Map<String, Word> dictionary = getData();
		System.out.println(addWord(dictionary, new Word("Student", " Học Sinh" , "Danh tư" , "Học Sinh")));
		print(dictionary);
		
		System.out.println(search(dictionary, "Go"));
	}
	
	private static Map<String, Word> getData(){
		Map<String, Word> dictionary = new HashMap<>();
		dictionary.put("Go", new Word("Go", " Đi" , "Động từ" , "Đi chơi"));
		dictionary.put("School", new Word("School", " Trường" , "Danh từ" , "Trường học"));
		dictionary.put("Hello", new Word("Hello", " Xin Chào" , "Động từ" , "Chào"));
		return dictionary;
	}
	
	private static void print (Map<String, Word> dictionarys ) {
		for(Entry<String, Word> dictionary : dictionarys.entrySet() ) {
			System.out.println(dictionary.getValue());
		}
	}
	
	private static boolean addWord(Map<String, Word> dictionary , Word word ) {
		if(dictionary.containsKey(word.getWord())) {
			return false;
		}
		dictionary.put(word.getWord(),word );
		return true;
	}
	
	private static Word search(Map<String, Word> dictionary,String word ) {
		return dictionary.get(word);
	}
}
