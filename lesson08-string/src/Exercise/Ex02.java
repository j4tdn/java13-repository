package Exercise;

import java.util.ArrayList;
import java.util.List;

public class Ex02 {
	public static void main(String[] args) {
		String bh1 = "d:/music/shapeofyou.mp3";
		String bh2 = "d:/music/allweknow.mp3";
		String bh3 = "d:/music/onmyqay.mov";
		String[] paths = {bh1, bh2, bh3};
		
		ArrayList<String> songs = songsMp3List(paths);
		for(String song:songs) {
			System.out.println(song);
		}
	}
	
	private static ArrayList<String> songsMp3List(String[] paths) {
		ArrayList<String> list = new ArrayList<String>();
		for(String song:paths) {
			if(song.contains("mp3")) {
				int start = song.lastIndexOf("/") + 1;
				int end = song.indexOf(".");
				
				String s = song.substring(start, end);
				
				list.add(s);
			}
		}
		return list;
	}
}
