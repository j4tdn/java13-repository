package ex04;

import java.util.Map;

import bean.TypeWord;
import bean.Word;
import model.WordData;

/**
 * @author Pho Dac Biet
 *	Viết chương trình từ điển tiếng anh. Trong đó, 1 word bao gồm từ, nghĩa, loại từ, và ghi chú.
	Chương trình từ điển bao gồm các phuơng thức sau đây:
	- Thêm mới từ vựng
	- Tra từ điển
 */
public class App {
	public static void main(String[] args) {
		Map<String, Word> dictionary = WordData.getAll();
		
		// Thêm mới từ vựng
		// success
		dictionary.put("Badly", new Word("Badly", "Toi Te", TypeWord.ADV, "o"));
		dictionary.put("Quickly", new Word("Quickly", "Nhanh chong", TypeWord.ADV, "o"));
		// failed
		dictionary.put("Beautiful", new Word("Beautiful", "Xinh Dep", TypeWord.ADJ, "x"));
		
		System.out.println("-----DICTIONARY-----");
		WordData.print(dictionary);
		
		// Tra từ điển
		System.out.println("-----SEARCHING-----");
		//System.out.println("Result: \n" + search(dictionary, "Boy"));
		System.out.println("Result: \n" + search(dictionary, "VietNam"));
	}
	
	private static Word search(Map<String, Word> dictionary, String key) {
		return dictionary.get(key);
	}
}
