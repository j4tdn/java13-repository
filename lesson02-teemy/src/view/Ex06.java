package view;


public class Ex06 {
	public static void main(String[] args) {
		int count = 0;
		int i=1;
		while (count < 200) {
			i++;
			if(checksnt(i)) {
				count++;
			}
		}
		System.out.println(i);
	}
	public static boolean checksnt(int a) {
		for(int i=2;i<=Math.sqrt(a);i++) 
			if(a%i==0) 
				return false;
		return true;
	}
}
