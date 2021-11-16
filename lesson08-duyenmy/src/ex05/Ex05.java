package ex05;

import java.util.Vector;

public class Ex05 {
	public static void main(String[] args) {
		String s1 = "ABCEDABCKM";
		String s2 = "ABCEDCBBCK";

		System.out.println("Xâu con chung dài nhất: " );
		getSubstring(s1,s2);
	}

	private static void getSubstring(String s1, String s2) {
		
		Vector<String> rs = new Vector<String>();
		for(int i=0; i< s1.length();i++) {
			for(int j=0;j<s2.length();j++) {
				if(s1.charAt(i)==s2.charAt(j)) {
					rs.add(Character.toString(s1.charAt(i)));
				}else {continue;}
			}
		}
	
		for(int k=0;k<rs.size();k++) {
			System.out.print(rs.get(k)+" ");}
		}
		
		
}
