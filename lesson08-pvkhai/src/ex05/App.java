package ex05;

public class App {
	public static void main(String[] args) {
		String s1 = "ABCEDEABC";
		String s2 = "ABCEDEACBBCK";
		System.out.println(getLongestCommonSubstring(s1, s2));
	}
	private static String getLongestCommonSubstring(String s1, String s2) {
		String result = "";
		
		for(int i = 0; i < s1.length(); i++) {
			for(int j = i + 1; j < s1.length(); j++) {
				if(s2.contains(s1.substring(i, j))) {
					if(result.length() < s1.substring(i, j).length()) {
						result = s1.substring(i, j);
					}
				}
			}
		}
		
		return result;
	}
}
