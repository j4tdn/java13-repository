package ex04;

import java.util.Map;

public class DictionaryUtils {
	private DictionaryUtils() {}
	
	public static void add(Map<String, Dictionary> list, Dictionary dictionary) {
		list.put(dictionary.getWord(), dictionary);
	}
	
	public static Dictionary search(Map<String, Dictionary> list, String word) {
		return list.get(word);
	}
}
