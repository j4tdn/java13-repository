package baitap;

public class Ex07 {
	public static void main(String[] args) {
		String s = "aaabaaabbaaaaaaaaa";
		findRightSubString(s);
	}
	
	private static void findRightSubString(String s) {
		int startl = 0, starts = 0;
		int max = 0;
		int min = Integer.MAX_VALUE;
	    int i = 0;
	    while(i < s.length()) {
	    	int count = 0;
	    	for(int j = i; j< s.length(); j++) {
	    		if(s.charAt(i) == s.charAt(j)) {
	    			count++;
	    		} else {
	    			break;
	    		}
	    	}
	    	if(count > max) {
	    		max = count;
	    		startl = i;
	    	}
	    	if(count < min) {
	    		min = count;
	    		starts = i;
	    	}
	    	 i = i+ count;
	    }
	    System.out.println(max + " \"" + s.substring(startl,startl + max ) + "\" [" + startl + "]");
	    System.out.println(min + " \"" + s.substring(starts,starts + min ) + "\" [" + starts + "]");
	}
}
