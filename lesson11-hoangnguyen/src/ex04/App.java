package ex04;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
	
	public static void main(String[] args) {
		Map<String, Dictionary> list = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		list.put("go", new Dictionary("go", "đi", "VERB", "i go to school"));
		list.put("love", new Dictionary("love", "yêu, thich", "ADJECTIVE", "i love you"));
		list.put("study", new Dictionary("study", "học", "VERB", "i'm studying very hard"));
		
		DictionaryUtils.add(list, new Dictionary("sit", "ngồi", "VERB", "i sit to the chair"));
		System.out.println(DictionaryUtils.search(list, "love"));
	}
	
	
}
