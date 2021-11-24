package execier09;

public class Ex03 {
	public static void main(String[] args) {
		String input ="  Welcome   to JAVA10 class  ";
		
		
		StringBuilder sb = new StringBuilder();
		String [] words = input.split("\\s+");
		for(String word : words) {
			sb.append(reverse(word)).append(" ");
			
		}
		System.out.println(sb.toString().trim());
		
		
	}
	private static String reverse(String string) {
//		String output = "";
//		for(int i = string.length()- 1; i >=0;i--) {
//			output += string.charAt(i);
//		}
//		return output;
//	}
	return new StringBuilder(string).reverse().toString();
	
	}
}
