package view;

public class Ex02 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		int s = 0;
		while(i<=18 ) {
			s+=i;
			i++;
			if(i==4) sum+=s;
			if(i==7) sum+=s;
			if(i==12) sum+=s;
			if(i==18) sum+=s;
		}
		System.out.println("tong = "+sum);
	}
}
