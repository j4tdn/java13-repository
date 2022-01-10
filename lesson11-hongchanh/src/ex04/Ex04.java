package ex04;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		
		List<Word> words = new ArrayList<>();
		Dictionary myDic = new Dictionary(words);
		
		myDic.add(new Word("hero", "anh hùng", "Noun", "he is a hero"));
		myDic.add(new Word("dragon", "rồng", "Noun", "dragon isn't real"));
		myDic.add(new Word("good", "tốt", "Adj", "very good!"));
		myDic.add(new Word("eat", "ăn", "Verb", "i don't eat bread "));
		myDic.add(new Word("run", "chạy", "Verb", "run away!"));
		myDic.show();
		System.out.println("========================================");
		
		myDic.find("run");
	}
	
}