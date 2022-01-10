package ex04;

import java.util.ArrayList;
import java.util.List;

public class Ex04 {
	public static void main(String[] args) {
		List<Word> words = new ArrayList<>();
		Dictionary myDic = new Dictionary(words);
		myDic.addWord(new Word("history", "lịch sử", "danh từ (Noun)", "Country's history is long"));
		myDic.addWord(new Word("computer", "máy tính", "danh từ (Noun)", "The computer is cheap"));
		myDic.addWord(new Word("run", "chạy", "động từ (Verb)", "Everyday I run for heathy"));
		myDic.addWord(new Word("suitable", "phù hợp", "tính từ (Adj)", "The computer is not suitable for me"));
		myDic.addWord(new Word("sometimes", "thỉnh thoảng", "trạng từ (Adv)", "Sometimes I read some books"));
		myDic.showDictionary();
		System.out.println("========================================");
		myDic.lookUp("run");
	}
	
}
