package ex04;

public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int b = 75;
		int a = 15;
		
		if(check (a,b)) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
		
	}
	
	private static boolean check(int a, int b) {
		for (int i=1; i<= a; i++) {
			if ( a%i ==0) {
				if (snt(i)) {
					if ( b%i !=0) {
						return false;
					}
				}
			}
		}
		
		return true;
	}
	
	private static boolean snt(int a) {
		if (a==1 || a==2) {
			return true;
		}
		for (int i=2; i<a; i++) {
			if (a%i == 0) {
				return false;
			}
		}
		return true;
	}

}
