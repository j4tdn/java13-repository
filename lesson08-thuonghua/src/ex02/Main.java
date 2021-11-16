package ex02;

public class Main {
	public static void main(String[] args) {

		String input = "aDamn    Le vAN    john Son";
		String chr = null;
		String[] digits = input.split("\\s+");
		 for(String name : digits) {
			 char[] firstChar = name.toCharArray();
			 for(int i = 0; i < firstChar.length; i++) {
				 if(i == 0) {
					 chr =  String.valueOf(firstChar[i]);
					 System.out.print(chr.toUpperCase());
				 } else {
					 chr = String.valueOf(firstChar[i]);
					 System.out.print(chr.toLowerCase());
				 }
			 }
			 System.out.print(" ");
		 }
	}
}
