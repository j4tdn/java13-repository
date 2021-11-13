package ex03;


public class Ex03 {
	public static void main(String[] args) {
		String s = " Welcome  to  JAVA10 class  ";
		System.out.println("Output: " + converseWords(s));
	}
	
	private static String converseWords(String s) {
		String result = "";
		s = s.trim();
		s = s.replaceAll("[\\s]+", " ");
		String [] words = s.split(" ");
		for(int i = 0; i < words.length; i++) {
			StringBuffer ss = new StringBuffer(words[i]);
			result = result + ss.reverse().toString();
			if (i < s.length()-1) result += " ";
		}
		 return result;
		
	}
	
	
}
