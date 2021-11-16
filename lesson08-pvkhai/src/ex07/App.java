package ex07;

public class App {
	public static void main(String[] args) {
		String s = "aaabaaabbaaaaa";
		longestCorrectSub(s);
	}
	
	public static void longestCorrectSub(String s) {
		int longest = 1;
		int start = 0;
		int firstIndex = 0, lastIndex = 0;
		int count = 1;

		for(int i = 0; i < s.length(); ) {
			start = i;
			for(int j = i + 1; j < s.length(); j++) {
				if(s.charAt(i) == s.charAt(j)) {
					count++;
				}else {
					break;
				}
			}
			if(count > longest) {
				longest = count;
				firstIndex = start;
			}
			i = i + count;
			count = 1;
		}
		lastIndex = firstIndex + longest;
		System.out.println("Độ dài lớn nhất của dãy con đúng: " + longest + "," + s.substring(firstIndex, lastIndex) 
							+ "[" + firstIndex + "]");

	}

}
