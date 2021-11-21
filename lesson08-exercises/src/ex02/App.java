package ex02;

public class App {
	private static String inputString = "aDam Le vAN john Son";
	
	public static void main(String[] args) {
		System.out.println("Original string:        |||" + 
				inputString + "|||");
		
		System.out.println("String after processed: |||" + capitalizeFirstWordLetter(inputString) + "|||");
	}
	
	private static StringBuilder capitalizeFirstWordLetter(String inputString) {
		String inputStringToLowerCase = inputString.toLowerCase();
		StringBuilder inputStringBuilder = new StringBuilder(inputStringToLowerCase);
		
		// Capitalize 1st letter
		inputStringBuilder.setCharAt(0, Character.toUpperCase(inputStringBuilder.charAt(0)));
		
		// Capitalize 1st letter after space
		for(int i = 0; i < inputStringBuilder.length(); i++)
		{
			if (inputStringBuilder.charAt(i) == ' ') {
				inputStringBuilder.setCharAt(i+1, Character.toUpperCase(inputStringBuilder.charAt(i+1)));
			}
		}
		return inputStringBuilder;
	}
}
