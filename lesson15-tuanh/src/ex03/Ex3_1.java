package ex03;

public class Ex3_1{
    public static void main(String args[]) {
    	String str1 = "Word";
    	String str2 = "oWrrd";
    	String str3 = "orWd";
    	System.out.println(anagram(str1, str2) );	
    	System.out.println(anagram(str1, str3) );
    }
	public static boolean anagram(String s, String t) {
	    if(s.length() != t.length())
	        return false;

	    int value = 0;
	    for(int i = 0; i < s.length(); i++){
	        value += ((int)s.charAt(i))^2;
	        value -= ((int)t.charAt(i))^2;
	    }
	    return value == 0;
	}
} 