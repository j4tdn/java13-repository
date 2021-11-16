package ex05;

public class Ex05 {
	public static void main(String[] args) {
		String s1 = "ABCEDABC";
		String s2 = "ABCEDCBBCK";
		
		System.out.println("Xâu con chung dài nhất: " + getSubstring(s1, s2));
	}
	
	private static String getSubstring(String s1, String s2) {
		String result = "";
		for(int i = 0; i<s1.length()-1; i++) {
			for(int j = i+1; j<s1.length(); j++) {
				if(s2.contains(s1.substring(i, j))) {
					if(result.length()<s1.substring(i, j).length()) result = s1.substring(i, j);
				}
			}
		}
		return result;
	}
}
