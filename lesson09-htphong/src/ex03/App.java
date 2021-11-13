package ex03;

public class App {
	public static void main(String[] args) {
		String s = "Welcome   to   Java10  class";
		System.out.println(revert(s));
	}
	
	private static String revert(String s) {
		s = s.trim().replaceAll("[\\s]+", " ");
		String[] a = s.split(" ");
		for(int i = 0; i<a.length; i++) {
			StringBuilder h = new StringBuilder(a[i]);
			a[i] = h.reverse().toString();
		}
		String result = "";
		for(int i = 0; i<a.length;i++) {
			if(i==a.length-1) {
				result += a[i];
			}
			else {
				result += a[i]+" ";
			}
		}
		return result;
	}

}
