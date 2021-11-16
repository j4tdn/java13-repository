package ex07;

public class Ex07 {
	public static void main(String[] args) {
		String s = "aaaaabaaabba";
		int max = 0;
		int min = Integer.MAX_VALUE;
		int posMax = -1, posMin = -1;
		for(int i = 0; i<s.length(); i++) {
			int count=0;
			
			for(int j = i; j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					count++;
				}
				else {
					if(max<count) {
						max = count;
						posMax = i;
					}
					if(min>count) {
						min = count;
						posMin=i;
					}
					i=j-1;
					break;
				}
			}
		}
		System.out.println(max +" \"" +s.substring(posMax, posMax+max) +"\" " + "["+posMax+"]");
		System.out.println(min +" \"" +s.substring(posMin, posMin+min) +"\" " + "["+posMin+"]");
	}
	
}
