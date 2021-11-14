package ex02;

public class Ex02 {
	public static void main(String[] args) {
		String[] string = new String[2];
		string[0] = "aa6b546c6e22h";
		string[1] = "aa6b326c6e22h";
		
		String[] result = getLargestNumbers(string);
		for(String results : result) {
			System.out.println(results);
		}
	}
	private static String[] getLargestNumbers(String[] string) {
		int[] result = new int[string.length];
		String[] resultString = new String[string.length];
		int max = 0;
		
		for (int i = 0; i < string.length; i++) {
			max = 0;
			int tmp = 0;
			String[] array = string[i].split("[a-z]+");
			for (String st : array) {
				tmp = Integer.parseInt(st);
				if(tmp > max) {
					max = tmp;
				}
			}
			result[i] = max;
		}
		for (int i = 0; i < string.length; i++) {
			resultString[i] = String.valueOf(result[i]);
		}
		
		return resultString;
	}
}
